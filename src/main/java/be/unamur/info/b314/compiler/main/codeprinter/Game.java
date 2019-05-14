package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;

import java.util.HashMap;

public class Game {
    private String fileName;
    private HashMap<Coordinate, Character> map;
    private Coordinate codyPos;

    public Game(SymbolTable symbolTable, String fileName) {
//        initMap et init codyPos
        this.fileName = fileName;
        initMap(symbolTable);
    }

    private void initMap(SymbolTable symbolTable) {
//        walk la map
    }

    @Override
    public String toString() {
        return "Game{" +
                "map=" + map +
                ", codyPos=" + codyPos +
                '}';
    }
}
