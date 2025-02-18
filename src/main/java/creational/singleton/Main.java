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

        System.out.println("Reflection test");

        Constructor<ConfigManager> constructor = ConfigManager.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ConfigManager newInstance = constructor.newInstance();
        ConfigManager newInstance1 = constructor.newInstance();
        System.out.println(newInstance.hashCode());
        System.out.println(newInstance1.hashCode());
        System.out.println(configManager.hashCode());

        System.out.println("Reflection test2");
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton.hashCode());
        Constructor<MySingleton> constructor1 = MySingleton.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        MySingleton newInstance2 = constructor1.newInstance();
        System.out.println(newInstance2.hashCode());
        MySingleton newInstance3 = constructor1.newInstance();
        System.out.println(newInstance3.hashCode());


    }
}
