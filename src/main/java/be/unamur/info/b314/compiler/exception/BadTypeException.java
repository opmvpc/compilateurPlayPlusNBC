package be.unamur.info.b314.compiler.exception;

public class BadTypeException extends Exception {
    public BadTypeException(String message) {
        super(message);
    }

    public BadTypeException(String message, Exception cause) {
        super(message, cause);
    }
}
