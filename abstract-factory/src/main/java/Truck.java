public class Truck implements IVehicle{
    private final String companyName;
    public Truck(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void startEngine() {
        System.out.println(String.format("%s Truck engine has started.", companyName));
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
