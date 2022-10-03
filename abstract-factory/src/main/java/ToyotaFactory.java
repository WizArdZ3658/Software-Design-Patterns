public class ToyotaFactory implements IFactory{
    @Override
    public IVehicle getVehicle(String identifier) {
        if (identifier == "truck") {
            return new Truck("toyota");
        } else if (identifier == "bike") {
            return new Bike("toyota");
        } else if (identifier == "car") {
            return new Car("toyota");
        } else {
            return new Car("toyota");
        }
    }
}
