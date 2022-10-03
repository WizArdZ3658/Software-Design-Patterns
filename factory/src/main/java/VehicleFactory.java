public class VehicleFactory {
    public static IVehicle getInstance(String identifier) {
        if (identifier == "truck") {
            return new Truck();
        } else if (identifier == "bike") {
            return new Bike();
        } else {
            return new Car();
        }
    }
}
