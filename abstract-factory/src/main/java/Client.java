public class Client {

    public static void main(String[] args) {

        IFactory factory = AbstractFactory.getFactory("toyota");
        IVehicle vehicle = factory.getVehicle("bike");

        vehicle.startEngine();
        System.out.println(vehicle.getMileage());
        System.out.println(vehicle.getNumberOfWheels());
    }
}
