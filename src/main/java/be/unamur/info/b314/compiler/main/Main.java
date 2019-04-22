package be.unamur.info.b314.compiler.main;


import be.unamur.info.b314.compiler.PlayPlusLexer;
import be.unamur.info.b314.compiler.PlayPlusParser;


//import be.unamur.info.b314.compiler.NBCPrinter;
//import be.unamur.info.b314.compiler.NBCVisitor;
import be.unamur.info.b314.compiler.exception.BadNamingException;
import be.unamur.info.b314.compiler.exception.BadTypeException;
import be.unamur.info.b314.compiler.exception.MapConfigException;
import be.unamur.info.b314.compiler.exception.SymbolNotFoundException;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.DefPhase;
import be.unamur.info.b314.compiler.main.symboltable.RefPhase;

import static com.google.common.base.Preconditions.checkArgument;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import be.unamur.info.b314.compiler.main.symboltable.CheckNamingConventions;
import be.unamur.info.b314.compiler.main.symboltable.CheckTypes;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author James Ortiz - james.ortizvega@unamur.be
 */
public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private static final String NAME = "b314-compiler";
    private static final String HELP = "h";
    private static final String INPUT = "i";
    private static final String OUTPUT = "o";

    /**
     * Main method launched when starting compiler jar file.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Main main = new Main();
        CommandLineParser parser = new DefaultParser();
        CommandLine line = null;
        try {
            line = parser.parse(main.options, args);
        } catch (ParseException ex) {
            LOG.error("Errors while parsing command line!", ex);
            main.printHelpMessage();
        }
        // If help is requested, print help message and exit.
        if (line != null) {
            if (line.hasOption(HELP)) {
                main.printHelpMessage();
            } else {
                // Else start compilation
                try {
                    main.initialise(line);
                    main.compile(); // Call compile method (to be completed)
                    System.err.println("OK"); // Print OK on stderr
                } catch (Exception e) {
                    LOG.error("Exception occured during compilation!", e);
                    System.err.println("KO"); // Print KO on stderr if a problem occured
                }
            }
        }
    }

    /**
     * The command line options.
     */
    private final Options options;

    /**
     * The input B314 file.
     */
    private static File inputFile;

    /**
     * The output PCode file.
     */
    private File outputFile;

    private PlayPlusParser parser;

    private Main() {
        // Create command line options
        options = new Options();
        options.addOption(Option.builder(HELP)
                .desc("Prints this help message.")
                .build());

        options.addOption(Option.builder(INPUT)
                .desc("The B314 input file.")
                .hasArg()
                .build());

        options.addOption(Option.builder(OUTPUT)
                .desc("The PCOde output file.")
                .hasArg()
                .build());
    }

    /**
     * Prints help message with this options.
     */
    private void printHelpMessage() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(128);
        formatter.printHelp(String.format("java -jar %s.jar -%s | %s %s",
                NAME, HELP, INPUT, OUTPUT), options);
    }

    /**
     * Initialise the input compiler using the given input line.
     *
     * @throws Exception If one of the three required arguments is not provided.
     */
    private void initialise(CommandLine line) throws Exception {
        LOG.debug("Initialisation");
        // Check that the arguments are there
        if (!line.hasOption(INPUT)) {
            throw new ParseException(String.format("Option %s is mandatory!", INPUT));
        } else if (!line.hasOption(OUTPUT)) {
            throw new ParseException(String.format("Option %s is mandatory!", OUTPUT));
        }
        // Get given files and check they exist
        inputFile = new File(line.getOptionValue(INPUT));
        checkArgument(inputFile.exists() && inputFile.isFile(), "File %s not found!", inputFile.getName());
        LOG.debug("Input file set to {}", inputFile.getPath());

        outputFile = new File(line.getOptionValue(OUTPUT));
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }
        checkArgument(outputFile.exists() && outputFile.isFile(), "File %s not created!", outputFile.getName());
        LOG.debug("Output file set to {}", outputFile.getPath());

        LOG.debug("Initialisation: done");
    }


    /**
     * Compiler Methods, this is where the MAGIC happens !!! \o/
     */
    private void compile() throws IOException, SymbolNotFoundException, BadNamingException, MapConfigException, BadTypeException {

        // Put your code here !

        // Get abstract syntax tree
        LOG.debug("Parsing input");
        printSourceFile(inputFile);
        PlayPlusParser.RootContext tree = parse(new ANTLRInputStream(new FileInputStream(inputFile)));
        new FileInputStream(inputFile);
        LOG.debug("Parsing input: done");
        LOG.debug("AST is {}", tree.toStringTree(parser));
        // Build symbol table
        LOG.debug("Building symbol table");
        Map<String, Integer> symTable = fillSymTable(tree);
        LOG.debug("Building symbol table: done");
        // Print NBC Code
        LOG.debug("Printing NBC Code");
        // printNBCCode(tree, symTable);
        LOG.debug("Printing NBC Code: done");
    }

    /**
     * Builds the abstract syntax tree from input.
     */
    private PlayPlusParser.RootContext parse(ANTLRInputStream input) throws ParseCancellationException {
        // Create the token stream
        CommonTokenStream tokens = new CommonTokenStream(new PlayPlusLexer(input));
        // Intialise parser
        parser = new PlayPlusParser(tokens);
        // Set error listener to adoc implementation
        parser.removeErrorListeners();
        MyConsoleErrorListener errorListener = new MyConsoleErrorListener();
        parser.addErrorListener(errorListener);
        // Launch parsing
        PlayPlusParser.RootContext tree;
        try {
            tree = parser.root();
        } catch (RecognitionException e) {
            throw new IllegalArgumentException("Errors while retrieving parsing tree!", e);
        }
        if (errorListener.errorHasBeenReported()) {
            throw new IllegalArgumentException("Errors while parsing input!");
        }
        return tree;
    }

    /**
     * Builds symbol table from AST.
     */
    private Map<String, Integer> fillSymTable(PlayPlusParser.RootContext tree) throws SymbolNotFoundException, BadNamingException, MapConfigException, BadTypeException {
        ParseTreeWalker walker = new ParseTreeWalker();

        printTitle("Def Phase");
        Errors errors = new Errors();
        DefPhase def = new DefPhase(errors);
        walker.walk(def, tree);

        printTitle("Check Naming conventions Phase");
        new CheckNamingConventions(def.getSymTable(), errors);

        printTitle("Ref Phase");
        RefPhase ref = new RefPhase(def.getSymTable(), errors);
        walker.walk(ref, tree);

        printTitle("Check Types Phase");
        CheckTypes checkTypes = new CheckTypes(def.getSymTable(), errors);
        walker.walk(checkTypes, tree);

        printTitle("Errors");
        System.out.println(errors.toString());

        printSeparator();

        if (!errors.symbolNotFound.isEmpty()) {
            throw new SymbolNotFoundException(errors.symbolNotFound.toString());
        }
        if (!errors.badNameError.isEmpty()) {
            throw new BadNamingException(errors.badNameError.toString());
        }
        if (!errors.badTypeError.isEmpty()) {
            throw new BadTypeException(errors.badTypeError.toString());
        }
        if (!errors.mapError.isEmpty()) {
            throw new MapConfigException(errors.mapError.toString());
        }

//        return def.getSymTable();
//        en attendant
        return new HashMap<>();
    }

    /*
        private void printNBCCode(PlayPlusParser.RootContext tree, Map<String, Integer> symTable) throws FileNotFoundException {

            NBCPrinter printer = new NBCPrinter("nbcCode.nbc");
            NBCVisitor visitor = new NBCVisitor(symTable, printer);
            tree.accept(visitor);
            printer.flush();
            printer.close();
        }
    */
    private static void printSourceFile(File file) {
        printSeparator();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), StandardCharsets.UTF_8));) {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("==================================================================\n\n");
    }

    private static void printSeparator() {
        System.out.println("\n\n==================================================================");
    }

    private void printTitle(String title) {
        System.out.println("\n==================================================================");
        System.out.println("\t\t\t\t" + title);
        System.out.println("==================================================================\n");
    }
}