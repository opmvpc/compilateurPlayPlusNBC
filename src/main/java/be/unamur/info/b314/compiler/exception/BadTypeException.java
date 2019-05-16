package be.unamur.info.b314.compiler.exception;

/**
 * @overview BadTypeException represente les erreurs lié aux types
 */
public class BadTypeException extends Exception {
    /**
     * @effects initialise une BadTypeException avec un message
     * @param message
     */
    public BadTypeException(String message) {
        super(message);
    }
}
