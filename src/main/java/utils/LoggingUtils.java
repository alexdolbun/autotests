package utils;

import com.google.common.io.BaseEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class LoggingUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger("binary_data_logger");

    private LoggingUtils() {
        //statics only
    }

    public static void log(File file, String message) {
        LOGGER.info("RP_MESSAGE#FILE#{}#{}", file.getAbsolutePath(), message);
    }

    public static void log(byte[] bytes, String message) {
        LOGGER.info("RP_MESSAGE#BASE64#{}#{}", BaseEncoding.base64().encode(bytes), message);
    }

    public static void logBase64(String base64, String message) {
        LOGGER.info("RP_MESSAGE#BASE64#{}#{}", base64, message);
    }
}