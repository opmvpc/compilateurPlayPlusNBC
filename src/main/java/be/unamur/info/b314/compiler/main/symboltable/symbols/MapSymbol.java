package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

/**
 * @overview  La classe MapSymbol represente le symbole de la Map de jeu
 * constitué d'un tableau à deux dimensions representant la carte de jeu
 * ainsi que les coordonnées initial de Cody
 *
 *  @specfiled carte: char[][]
 *  @specfiled initX: int
 *  @specfiled initY: int
 *  @specfiled errors: Errors
 */
public class MapSymbol extends Symbol {
    private char[][] carte;
    private int initX;
    private int initY;
    private Errors errors;

    /**
     * Constructeur
     * @effects initialise une MapSymbol avec le name, un type et un errors     *
     * @param name  le nom de la map (map:)
     * @param type   de la map
     * @param errors represente les erreurs mapErrors qu'on peut avoir

     */
    public MapSymbol(String name, Type type, Errors errors) {
        super(name, type);
        this.errors = errors;
    }

    /**
     * @return un tableau à deux dimensions representant la carte
     */
    public char[][] getCarte() {
        return carte;
    }

    /**
     * @return initX retourne la coordonée X
     */
    public int getInitX() {
        return initX;
    }

    /**
     * @return initY retourne la coordonée Y
     */
    public int getInitY() {
        return initY;
    }

    /**
     * @param mapX Coordonnée X du tableau
     * @param mapY Coordonnée Y du tableau
     * @param line tous les elements à mettre dans le tableau
     * @return un boolean un true si les coordonnées de la Map sont valides
     */
    private boolean isvalidParamMap(String mapX, String mapY, String line) {
        int x = 0;
        int y = 0;
        if (mapX == null || mapY == null) {
            errors.mapError.add("[null] Les coordonées du tableau sont invalides X=" + x + "ou Y= " + y);
            return false;
        }
        try {
            x = Integer.parseInt(mapX);
            y = Integer.parseInt(mapY);
        } catch (Exception e) {
            errors.mapError.add("[negatif] Les coordonées du tableau sont invalides X=" + x + "ou Y= " + y);
            return false;
        }
        if (x <= 0 || y <= 0) {
            errors.mapError.add("Les coordonées du tableau sont invalides avec X= " + x + " ou Y= " + y);
            return false;
        } else if ((x * y) != line.length()) {
            errors.mapError.add("Les coordonées ne correspondent pas à la taille du tableauX:" + x + " et Y:" + y);
            return false;
        }
        return true;
    }

    /**
     * Création d'un tableau à deux dimensions représentant  la carte de jeu
     * @effects initialise carte
     * @modifies carte
     * @param mapX Coordonnées X du tableau
     * @param mapY Coordonnées Y du tableau
     * @param line tous les éléments à mettre dans le tableau
     * @return true si la carte a été créer et qu'elle est correct sinon retourne false
     */
    public boolean createCarte(String mapX, String mapY, String line) {
        boolean isValid = isvalidParamMap(mapX, mapY, line);
        if (isValid) {
            int x = Integer.parseInt(mapX);
            int y = Integer.parseInt(mapY);
          //  carte = new char[x][y]; ok
            carte = new char[y][x];
            int z = 0;
            for (int i = 0; i < y; i++) { // original x
                for (int j = 0; j < x; j++) { // original y
                    carte[i][j] = line.charAt(z);
                    z++;
                }
                System.out.println("");
            }
            isValid=  isMapConfigCorrect();
        }
        return isValid;
    }

    /**
     * Vérifie si la configuration de la carte est correct,
     * si il y a 0 ou plusieurs Cody et 0 ou plusieurs trésors  on renvoi false
     *
     * @return true si la Config est correct
     */
    private boolean isMapConfigCorrect() {
        boolean isCorrect = true;
        int nbCody = 0;
        int nbTresor = 0;
        if (carte == null) {
            errors.mapError.add("La configuration de la carte est incorrect : Carte non construite ");
            return false;
        } else {
            // 1 - Check Un seul cody et un seul tresor
            for (int i = carte.length - 1; i >= 0; i--) {
                for (int j = 0; j < carte[i].length; j++) {
                    if (carte[i][j] == '@') {
                        nbCody++;
                        initX = j;
                        initY = i;
                    }
                    if (carte[i][j] == 'X') {
                        nbTresor++;
                    }
                }
            }
            if (nbCody != 1) {
                isCorrect = false;
                errors.mapError.add("La configuration de la carte est incorrect : Plusieurs Cody ");
            }
            if (nbTresor != 1) {
                isCorrect = false;
                errors.mapError.add("La configuration de la carte est incorrect : Plusieurs Tresor ");
            }
        }
        return isCorrect;
    }

    /**
     * @return String contenant la carte à afficher
     */
    private String afficheCarte() {
        String maps = "\n\t";
        if (carte != null) {
            for (int i = 0; i < carte.length; i++) {
                for (int j = 0; j < carte[i].length; j++) {
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
                ", \n\t\tinitX = " + initX +
                ", \n\t\tinitY = " + initX +
                "\n\t}";
    }

}
