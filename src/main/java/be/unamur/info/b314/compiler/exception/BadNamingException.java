package be.unamur.info.b314.compiler.exception;

public class BadNamingException extends Exception {


    public BadNamingException(String message) {
        super(message);
    }

    public BadNamingException(String message, Exception cause) {
        super(message, cause);
    }

}
