public class Car implements IVehicle{
    private final String companyName;
    public Car(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void startEngine() {
        System.out.println(String.format("%s Car engine has started.", companyName));
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
