package be.unamur.info.b314.compiler.exception;




/**
 *
 * @author James Ortiz - james.ortizvega@unamur.be
 */
public class GameException extends Exception{

    public GameException(String message) {
        super(message);
    }

    public GameException(String message, Exception cause) {
        super(message, cause);
    }
    
}
