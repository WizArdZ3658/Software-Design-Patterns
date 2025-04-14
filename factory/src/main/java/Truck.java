public class Truck implements IVehicle{

    @Override
    public void startEngine() {
        System.out.println("Truck engine has started.");
    }

    @Override
    public Integer getNumberOfWheels() {
        return 6;
    }

    @Override
    public Integer getMileage() {
        return 10;
    }
}
