package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
import be.unamur.info.b314.compiler.main.symboltable.symbols.MapSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class Game {
    private char[][] map;
    //private Coordinate codyPos;
    private int codyX;
    private int codyY;

    public Game(SymbolTable symbolTable) {
        Optional<Symbol> mapSymbol = symbolTable
                .getGlobals()
                .getSymbols()
                .stream()
                .filter(x -> x.getClass().getSimpleName().equals("MapSymbol"))
                .findFirst();

        if (mapSymbol.isPresent()) {
            MapSymbol mapSymGet =(MapSymbol) mapSymbol.get();
            this.map = mapSymGet.getCarte();
            this.codyX = mapSymGet.getInitX();
            this.codyY = mapSymGet.getInitY();
        }
    }

    public void moveCody(String actionword,int value){
        if (actionword.equals("left")){
            codyX -= 1;
        }
        if (actionword.equals("right")){
            codyX += 1;
        }
        if (actionword.equals("down")){
            codyY -= 1;
        }
        if (actionword.equals("up")){
            codyY += 1;
        }
        checkPositionCody();
        System.out.println("Cody New POS :\n" + "\tcodyX :" + codyX + "\n\tcodyY :" +codyY);
    }

    private void checkPositionCody(){
        char currentPosition = map[codyY][codyX];
        if ((currentPosition== '_') || (currentPosition== 'A') || (currentPosition== 'S')) {
            System.out.println("I will die if I execute this...");

        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "map=" + map +
                ",\n\t codyX: " + codyX +
                ",\n\t codyY: " + codyY +
                '}';
    }
}
