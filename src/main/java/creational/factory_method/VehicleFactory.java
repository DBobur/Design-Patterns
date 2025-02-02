package creational.factory_method;

public class VehicleFactory {
    public static Object createVehicle(String type) {
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("truck")) {
            return new Truck();
        } else {
            throw new IllegalArgumentException("Unknown type");
        }
    }
}

