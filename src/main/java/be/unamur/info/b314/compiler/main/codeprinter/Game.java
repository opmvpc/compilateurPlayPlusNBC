package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
import be.unamur.info.b314.compiler.main.symboltable.symbols.MapSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.HashMap;
import java.util.Optional;

public class Game {
    private char[][] map;
    private Coordinate codyPos;

    public Game(SymbolTable symbolTable) {
        Optional<Symbol> mapSymbol = symbolTable
                .getGlobals()
                .getSymbols()
                .stream()
                .filter(x -> x.getClass().getSimpleName().equals("MapSymbol"))
                .findFirst();

        if (mapSymbol.isPresent()) {
            this.map = ((MapSymbol) mapSymbol.get()).getCarte();
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "map=" + map +
                ", codyPos=" + codyPos +
                '}';
    }
}
