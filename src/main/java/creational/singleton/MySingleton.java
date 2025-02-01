package creational.singleton;

public class MySingleton {
    private MySingleton() {}
    private static final MySingleton INSTANCE = new MySingleton();

    public static MySingleton getInstance() {
        return INSTANCE;
    }
}