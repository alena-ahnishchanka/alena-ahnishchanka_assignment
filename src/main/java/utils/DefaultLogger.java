package utils;
import org.apache.log4j.Logger;

public class DefaultLogger {

    public static Logger logger = Logger.getLogger(DefaultLogger.class);

    public DefaultLogger() {}

    public static void error(String message) {
        logger.error(message);
    }

    public static void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    public static void warning(String message) {
        logger.warn(message);
    }

    public static void warning(String message, Throwable throwable) {
        logger.warn(message, throwable);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
}
