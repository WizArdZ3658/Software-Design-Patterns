public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.setHasMultiMediaModule(true);
//        car1.setHasABS(true);
//        car1.setName("Camry Hybrid");
//        car1.setManufacturer("Toyota");
//        car1.setOwnerName("Somnath");
//        car1.setHasReverseParkingCamera(true);
//        car1.setHasReverseParkingSensor(true);
//        car1.setModelNumber(1000);
//        car1.setEngineName("Fiat");
//        System.out.println(car1.toString());

        Builder carBuilder = new Builder();
        Car car1 = carBuilder.setHasMultiMediaModule(true).setHasABS(true).setName("Camry Hybrid").setManufacturer("Toyota")
                .setOwnerName("Somnath").setHasReverseParkingCamera(true).setHasReverseParkingSensor(true)
                .setModelNumber(1000).setEngineName("Fiat").get();

        System.out.println(car1);
    }
}
