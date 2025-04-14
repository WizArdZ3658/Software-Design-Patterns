public class Bike implements IVehicle{

    private final String companyName;

    public Bike(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void startEngine() {
        System.out.println(String.format("%s Bike engine has started.", companyName));
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
