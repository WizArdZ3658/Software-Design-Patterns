import enums.VehicleType;

public class Main {

    public static void main(String[] args) {

        IVehicle vehicle = VehicleFactory.getInstance(VehicleType.BIKE);

        vehicle.startEngine();
    }
}
