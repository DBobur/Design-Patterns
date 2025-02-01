package creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}