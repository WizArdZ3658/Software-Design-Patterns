public class Main {
    public static void main(String[] args) {

        IVehicle vehicle = VehicleFactory.getInstance("bike");

        vehicle.startEngine();
    }
}
