import java.util.Objects;

public class VehicleFactory {
    public static IVehicle getInstance(String identifier) {
        if (Objects.equals(identifier, "truck")) {
            return new Truck();
        } else if (Objects.equals(identifier, "bike")) {
            return new Bike();
        } else {
            return new Car();
        }
    }
}
