import java.util.Objects;

public class FordFactory implements IFactory{

    @Override
    public IVehicle getVehicle(String identifier) {
        if (Objects.equals(identifier, "truck")) {
            return new Truck("ford");
        } else if (Objects.equals(identifier, "bike")) {
            return new Bike("ford");
        } else if (Objects.equals(identifier, "car")) {
            return new Car("ford");
        } else {
            return new Car("ford");
        }
    }
}
