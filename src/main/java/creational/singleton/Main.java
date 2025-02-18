package creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args){
        //Eager Initialization Singleton
        //Bill Pugh Singleton
        //Lazy Initialization Singleton
        //Double-Checked Locking Singleton
        //Enum Singleton
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println(configManager.getProperty("hello"));

        System.out.println("Reflection test");

        Constructor<ConfigManager> constructor = null;
        try {
            constructor = ConfigManager.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            ConfigManager newInstance = constructor.newInstance();
            ConfigManager newInstance1 = constructor.newInstance();
            System.out.println(newInstance.hashCode());
            System.out.println(newInstance1.hashCode());
            System.out.println(configManager.hashCode());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Reflection test2");
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton.hashCode());
        Constructor<MySingleton> constructor1 = null;
        try {
            constructor1 = MySingleton.class.getDeclaredConstructor();
            constructor1.setAccessible(true);
            MySingleton newInstance2 = constructor1.newInstance();
            System.out.println(newInstance2.hashCode());
            MySingleton newInstance3 = constructor1.newInstance();
            System.out.println(newInstance3.hashCode());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
