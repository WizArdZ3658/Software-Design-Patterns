public class Bike implements IVehicle{

    @Override
    public void startEngine() {
        System.out.println("Bike engine has started.");
    }

    @Override
    public Integer getNumberOfWheels() {
        return 2;
    }

    @Override
    public Integer getMileage() {
        return 17;
    }
}
