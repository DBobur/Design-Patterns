package creational.singleton;

public class MySingleton {
    private MySingleton() {
        if(INSTANCE != null){
            System.out.println("MySingleton object is already instantiated");
            throw new RuntimeException("Can't instantiate MySingleton");
        }
    }
    private static final MySingleton INSTANCE = new MySingleton();

    public static MySingleton getInstance() {
        return INSTANCE;
    }
}