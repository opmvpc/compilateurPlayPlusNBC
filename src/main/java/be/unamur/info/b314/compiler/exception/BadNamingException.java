package be.unamur.info.b314.compiler.exception;

/**
 * @overview Classe utilisé pour les erreurs lié au nom des variables locales , globales et des fonctions
 */
public class BadNamingException extends Exception {

    /**
     * @effects inititialise une BadNamingException avec un message
     * @param message
     */
    public BadNamingException(String message) {
        super(message);
    }

}
