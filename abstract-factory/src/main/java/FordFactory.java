public class FordFactory implements IFactory{
    @Override
    public IVehicle getVehicle(String identifier) {
        if (identifier == "truck") {
            return new Truck("ford");
        } else if (identifier == "bike") {
            return new Bike("ford");
        } else if (identifier == "car") {
            return new Car("ford");
        } else {
            return new Car("ford");
        }
    }
}
