package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;


public class MapSymbol extends Symbol {
    private char[][] carte;

    /**
     * Constructeur
     * @param name
     * @param type
     */
    public MapSymbol(String name, Type type) {
        super(name, type);
    }

    /**
     *
     * @return carte
     */
    public char[][] getCarte() {
        return carte;
    }

    /**
     *
     * @param mapX Coordonnées 1 du tableau
     * @param mapY Coordonnées 1 du tableau
     * @param line tous les elements à mettre dans le tableau
     * @return un boolean un true pour dire si les coordonnées de la Map sont valides
     */
    private String isvalidParamMap(String mapX, String mapY, String line) {
        int x = 0;
        int y = 0;
        String typeError;
        try {
            x = Integer.parseInt(mapX);
            y = Integer.parseInt(mapY);
        } catch (Exception e) {
            return "[negatif] Les coordonées du tableau sont invalides X:" + x + "ou Y: " + y;
        }
        if (x <= 0 || y <= 0) {
            typeError = "Les coordonées du tableau sont invalides X:" + x + " ou Y: " + y;
            return typeError;
        } else if ((x * y) != line.length()) {
            typeError = "Les coordonées ne correspondent pas à la taille du tableauX:" + x + "-Y:" + y;
            return typeError;
        }

        return null;
    }

    /**
     * Création d'un tableau à deux dimensions représentant  la carte de jeu
     * @param mapX Coordonnées 1 du tableau
     * @param mapY Coordonnées 1 du tableau
     * @param line tous les éléments à mettre dans le tableau
     * @return null si la carte a été créer sinon retourne un message d'erreur
     */
    public String createCarte(String mapX, String mapY, String line) {
        String typeError = isvalidParamMap(mapX, mapY, line);
        if (typeError == null) {
            int x = Integer.parseInt(mapX);
            int y = Integer.parseInt(mapY);
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

    /**
     *  Vérifie si la config de la cart est correct, si il y a plusieurs Cody ou plusieurs trésors  on renvoi un message contenant le texte d'erreur
     * @return un message d'erreur ou null si la Config est correct
     */
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

    /**
     *
     * @return un String contenant la carte à afficher
     */
    private String afficheCarte() {
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
