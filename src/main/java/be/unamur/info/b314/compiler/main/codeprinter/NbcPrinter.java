package be.unamur.info.b314.compiler.main.codeprinter;

import org.stringtemplate.v4.*;

public class NbcPrinter {
    private ST hello;

    public NbcPrinter(ST hello) {
        this.hello = new ST("Hello, <name>");
        hello.add("name", "World");
        System.out.println(hello.render());
    }
}
