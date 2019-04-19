package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

import java.util.HashMap;

public class MapSymbol extends Symbol {
    private char[][] carte;

    public MapSymbol(String name, char[][] carte) {
        super(name);
        this.carte = carte;
    }

    public MapSymbol(String name, Type type, char[][] carte) {
        super(name, type);
        this.carte = carte;
    }

    public MapSymbol(String name, Type type) {
        super(name, type);
    }

    public char[][] getCarte() {
        return carte;
    }

    public boolean isvalidParamMap(int x, int y, String line) {
        if (x <= 0 || y <= 0) {
            System.out.println("[negatif] Les coordonées du tableau sont invalides X:" + x + "ou Y: " + y);
            return false;
        } else if ((x * y) != line.length()) {
            System.out.println("Les coordonées ne correspondent pas à la taille du tableauX:" + x + "-Y:" + y);
            return false;
        }

        return true;
    }

    public boolean isMapCorrect() {
        boolean found = false;
        int nbCody = 0;
        int nbTresor = 0;
        // 1 - Check Un seul cody et un seul tresor
        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte.length; j++) {
                if (carte[i][j] == '@') {
                    nbCody++;
                    if (nbCody != 1) {
                        return false;
                    }
                }
                if (carte[i][j] == 'X') {
                    nbTresor++;
                    if (nbTresor != 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void createCarte(int x, int y, String line) {
        if (isvalidParamMap(x, y, line)) {
            carte = new char[x][y];
            int z = 0;
            while (z < line.length()) {
                for (int i = 0; i < x && z < line.length(); i++) {
                    for (int j = 0; j < y && z < line.length(); j++) {
                        carte[i][j] = line.charAt(z);
                        z++;
                    }
                }
            }
        }
    }

    public String afficheCarte() {
        String maps = "\n\t";
        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte.length; j++) {
                maps = maps + " " + carte[i][j];
            }
            maps = maps + "\n\t";
        }
        return maps;
    }

    @Override
    public String toString() {
        return "MapSymbol" + " {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                ", \n\t\tcarte = " + afficheCarte() +
                "\n\t}";
    }


}
