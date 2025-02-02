package creational.factory_method.issue;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}