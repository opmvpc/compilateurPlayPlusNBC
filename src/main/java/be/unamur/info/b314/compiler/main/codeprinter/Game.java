package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
import be.unamur.info.b314.compiler.main.symboltable.symbols.MapSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import java.util.Optional;

/**
 * @overview Represente le jeu
 * @specfield map:char[][]
 * @specfield codyX:int
 * @specfield codyY:int
 * @specfield initialDirection:String
 * @specfield errors:Errors
 */
public class Game {
    private char[][] map;
    private int codyX;
    private int codyY;
    private String initialDirection = "";
    private Errors errors;
    private boolean isWin;

    /**
     * @effects initialise le jeu avec la table des symboles et le stockage des erreurs
     * @param symbolTable
     * @param errors
     */
    public Game(SymbolTable symbolTable, Errors errors) {
        this.errors = errors;
        Optional<Symbol> mapSymbol = symbolTable.getGlobals().getSymbols().stream()
                .filter(x -> x.getClass().getSimpleName().equals("MapSymbol")).findFirst();

        if (mapSymbol.isPresent()) {
            MapSymbol mapSymGet = (MapSymbol) mapSymbol.get();
            this.map = mapSymGet.getCarte();
            this.codyX = mapSymGet.getInitX();
            this.codyY = mapSymGet.getInitY();
        }
        System.out.println("INIT GAME CLASS : codyX = " + codyX + " codyY = " + codyY);
    }

    /**
     * Les mouvements de Cody
     * 
     * @param actionword
     * @param value
     */
    public void moveCody(String actionword, int value) {
        // for autour pour un mouvement à la fois?
        System.out.println("moveCody - actionword : " + actionword + " value : " + value);
        int tempX = codyX;
        int tempY = codyY;
        System.out.println("x ; " + tempX + " y: " + tempY);
        for (int i = 0; i < value; i++) {
            if (actionword.equals("left")) {
                codyX -= 1;
            }
            if (actionword.equals("right")) {
                codyX += 1;
            }
            if (actionword.equals("down")) {
                codyY += 1;
            }
            if (actionword.equals("up")) {
                codyY -= 1;
            }

            if (actionword.equals("jump")) {
                if (initialDirection.equals("left")) {
                    codyX -= 2;
                }
                if (initialDirection.equals("right")) {
                    codyX += 2;
                }
                if (initialDirection.equals("down")) {
                    codyY += 2;
                }
                if (initialDirection.equals("up")) {
                    codyY -= 2;
                }

            } else {
                initialDirection = actionword;
            }

            checkPositionCody(tempX, tempY);
        }
    }

    /**
     * Verification de la position de Cody
     * 
     * @param tempX
     * @param tempY
     */
    private void checkPositionCody(int tempX, int tempY) {
        // init to ascii 0
        System.out.println("CheckPositionCody : (" + codyX + "," + codyY + ")");
        System.out.println("Y max :" + map.length);
        System.out.println("X max :" + map[0].length);
        char currentPosition = 0;
        try {
            currentPosition = map[codyY][codyX];
            System.out.println("current position : " + currentPosition);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("cody out");
            errors.gameError.add("Cody plonge de le néant (out of bound)");
        }
        // si on est tombé dans l'eau ou dans un puits.
        if ((currentPosition == '_') || (currentPosition == 'S')) {
            this.errors.gameError.add("I will die if I execute this...");
        }
        // si obstacles
        if ((currentPosition == 'P') || (currentPosition == 'B') || (currentPosition == 'T')) {
            // reset position can't go further
            codyX = tempX;
            codyY = tempY;
        }
        // si squelettes
        if ((currentPosition == 'Q')) {
            System.out.println("Q");
        }
    }

    public void dig() {
        try {
            if (map[codyY][codyX] == 'X') {
                isWin = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            this.errors.gameError.add("Cody est déjà mort :(");
        }
    }

    public boolean isWin() {
        return isWin;
    }

    @Override
    public String toString() {
        return "Game{" + "map=" + map + ",\n\t codyX: " + codyX + ",\n\t codyY: " + codyY + '}';
    }
}
