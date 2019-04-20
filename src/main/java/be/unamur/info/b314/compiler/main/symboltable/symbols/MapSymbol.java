package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;


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

    public String isvalidParamMap(String mapX, String mapY, String line) {
        int x = 0;
        int y = 0;
        String typeError = null;
        try {
            x = Integer.parseInt(mapX);
            y = Integer.parseInt(mapY);
        } catch (Exception e) {
            return "[negatif] Les coordonées du tableau sont invalides X:" + x + "ou Y: " + y;
        }
        if (x <= 0 || y <= 0) {
            typeError = "Les coordonées du tableau sont invalides X:" + x + " ou Y: " + y;
            //     this.errors.mapError.add("La configuration de la carte est incorrect : Plusieurs Cody ");
            return typeError;
        } else if ((x * y) != line.length()) {
            typeError = "Les coordonées ne correspondent pas à la taille du tableauX:" + x + "-Y:" + y;
            return typeError;
        }

        return null;
    }
    public String createCarte(String mapX, String mapY, String line) {
        String typeError = isvalidParamMap(mapX, mapY, line);
        if (typeError == null) {
            Integer x = Integer.parseInt(mapX);
            Integer y = Integer.parseInt(mapY);
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
        return typeError;
    }

    public String isMapConfigCorrect() {
        String typeError = null;
        int nbCody = 0;
        int nbTresor = 0;
        if (carte == null) {
            typeError = "La configuration de la carte est incorrect : Carte non construite ";
        } else {
            // 1 - Check Un seul cody et un seul tresor
            for (int i = 0; i < carte.length; i++) {
                for (int j = 0; j < carte.length; j++) {
                    if (carte[i][j] == '@') {
                        nbCody++;
                        if (nbCody != 1) {
                            typeError = typeError + "La configuration de la carte est incorrect : Plusieurs Tresor ";
                        }
                    }
                    if (carte[i][j] == 'X') {
                        nbTresor++;
                        if (nbTresor != 1) {
                            typeError = typeError + "La configuration de la carte est incorrect : Plusieurs Tresor ";
                        }
                    }
                }
            }
        }
        return typeError;
    }

    public String afficheCarte() {
        String maps = "\n\t";
        if (carte != null) {
            for (int i = 0; i < carte.length; i++) {
                for (int j = 0; j < carte.length; j++) {
                    maps = maps + " " + carte[i][j];
                }
                maps = maps + "\n\t";
            }
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
