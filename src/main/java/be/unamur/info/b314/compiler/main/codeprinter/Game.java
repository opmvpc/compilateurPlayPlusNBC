package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
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
    private Errors errors;


    public Game(SymbolTable symbolTable, Errors errors) {
        this.errors = errors;
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
        // for autour pour un mouvement à la fois?
        System.out.println("moveCody : actionword : "+actionword + "value :" + value);
        int tempX = codyX;
        int tempY = codyY;
        System.out.println("x ; "+tempX + " y: " + tempY);
        for (int i = 0; i < value ; i++) {
            if (actionword.equals("left")){
                codyX -= 1;
            }
            if (actionword.equals("right")){
                codyX += 1;
            }
            if (actionword.equals("down")){
                codyY += 1;
            }
            if (actionword.equals("up")){
                codyY -= 1;
            }

            checkPositionCody(tempX,tempY);
        }
    }

    private void checkPositionCody(int tempX,int tempY){
        // init to ascii 0
        System.out.println("CheckPositionCody : (" + codyX + "," + codyY+")");
        char currentPosition = 0;
        try {
            currentPosition = map[codyY][codyX];
            System.out.println("current position : "+currentPosition);
        } catch (ArrayIndexOutOfBoundsException e){
            errors.gameError.add("Cody plonge de le néant (out of bound)");
        }
        // si on est tombé dans l'eau ou dans un puits.
        if ((currentPosition== '_') || (currentPosition== 'S')) {
            this.errors.gameError.add("I will die if I execute this...");
        }
        // si obstacles
        if ((currentPosition == 'P') || (currentPosition == 'B') || (currentPosition == 'T')){
            // reset position can't go further
            codyX = tempX;
            codyY = tempY;
        }
        // si squelettes
        if ((currentPosition == 'Q')){
            System.out.println("Q");
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

/*
— Le symbole “@” (robot) représente le robot qui prend une position de départ sur la carte,
— Le symbole “X” (trésor) représente le trésor que le robot veut déterrer,
— Le symbole “G” (pelouse) représente la pelouse (ou gazon),
— Le symbole “P” (palmiers) représente les palmiers,
— Le symbole “A” (pons) représente les ponts,
— Le symbole “B” (buissons) représente les buissons,
— Le symbole “T” (tonneau) représente les tonneaux,
— Le symbole “S” (puits) représente les puits,
— Le symbole “ ” (vide) représente de l’eau dans la carte,
— Le symbole “ Q” (squelette) représente les squellettes dans la carte,
 */