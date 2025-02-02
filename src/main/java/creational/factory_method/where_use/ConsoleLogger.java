package creational.factory_method.where_use;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console Logger: " + message);
    }
}