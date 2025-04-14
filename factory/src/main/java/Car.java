public class Car implements IVehicle{

    @Override
    public void startEngine() {
        System.out.println("Car engine has started.");
    }

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }

    @Override
    public Integer getMileage() {
        return 13;
    }
}
