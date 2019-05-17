package be.unamur.info.b314.compiler.exception;

/**
 * @overview MapConfigException represente les erreurs lié à la configuration et la representation de la map
 */
public class MapConfigException extends Exception {

    /**
     * @effects initialise MapConfigException avec un message
     * @param message
     */
    public MapConfigException(String message) {
        super(message);
    }

}
