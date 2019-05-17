package be.unamur.info.b314.compiler.exception;

/**
 * @overview FunctionException represente les erreurs lié aux functions
 */
public class FunctionException extends Exception {
    /**
     * @effects Initialise une FunctionException avec un message
     * @param message
     */
    public FunctionException(String message) {
        super(message);
    }
}
