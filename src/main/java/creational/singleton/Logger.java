package creational.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Logger {
    private static final long MAX_FILE_SIZE = 1024 * 1024;
    private static int fileCounter = 1;
    private static String currentLogFile = "log.txt";
    private static Logger instance;

    private FileWriter fileWriter;


    private Logger() {
        try {
            fileWriter = new FileWriter(currentLogFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try {
            File file = new File(currentLogFile);
            if (file.exists() && file.length() >= MAX_FILE_SIZE) {
                currentLogFile = "log_" + fileCounter++ + ".txt";
                fileWriter = new FileWriter(currentLogFile, true);
            }
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
