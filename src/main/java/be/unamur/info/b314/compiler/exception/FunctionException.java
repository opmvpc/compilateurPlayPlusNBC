package be.unamur.info.b314.compiler.exception;

public class FunctionException  extends Exception{
    public FunctionException(String message) {
        super(message);
    }

    public FunctionException(String message, Throwable cause) {
        super(message, cause);
    }
}
