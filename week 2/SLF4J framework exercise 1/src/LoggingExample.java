import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    static Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.trace("This is a TRACE log");
        logger.debug("This is a DEBUG log");
        logger.info("This is an INFO log");
        logger.warn("This is a WARN log");
        logger.error("This is an ERROR log");
    }
}
