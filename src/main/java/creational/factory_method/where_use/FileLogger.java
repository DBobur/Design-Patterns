package creational.factory_method.where_use;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File Logger: " + message);
    }
}