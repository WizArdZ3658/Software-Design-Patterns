import java.util.Objects;

public class ToyotaFactory implements IFactory{

    @Override
    public IVehicle getVehicle(String identifier) {
        if (Objects.equals(identifier, "truck")) {
            return new Truck("toyota");
        } else if (Objects.equals(identifier, "bike")) {
            return new Bike("toyota");
        } else if (Objects.equals(identifier, "car")) {
            return new Car("toyota");
        } else {
            return new Car("toyota");
        }
    }
}
