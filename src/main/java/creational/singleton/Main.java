package creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Eager Initialization Singleton
        //Bill Pugh Singleton
        //Lazy Initialization Singleton
        //Double-Checked Locking Singleton
        //Enum Singleton
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println(configManager.getProperty("hello"));

        Constructor<ConfigManager> constructor = ConfigManager.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ConfigManager newInstance = constructor.newInstance();
        ConfigManager newInstance1 = constructor.newInstance();
        System.out.println(newInstance.hashCode());
        System.out.println(newInstance1.hashCode());
        System.out.println(configManager.hashCode());
    }
}
