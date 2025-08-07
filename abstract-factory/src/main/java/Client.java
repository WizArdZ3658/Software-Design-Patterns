import enums.CompanyIdentifier;
import enums.VehicleType;

public class Client {

    public static void main(String[] args) {

        IFactory factory = AbstractFactory.getFactory(CompanyIdentifier.TOYOTA);
        IVehicle vehicle = factory.getVehicle(VehicleType.BIKE);

        vehicle.startEngine();
        System.out.println(vehicle.getMileage());
        System.out.println(vehicle.getNumberOfWheels());
    }
}
