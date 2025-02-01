package creational.singleton;

public class Main {
    public static void main(String[] args) {
        //Eager Initialization Singleton
        //Bill Pugh Singleton
        //Lazy Initialization Singleton
        //Double-Checked Locking Singleton
        //Enum Singleton
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println(configManager.getProperty("hello"));
    }
}
