public class Builder {
    Car car;

    Builder() {
        this.car = new Car();
    }

    public Builder setModelNumber(Integer modelNumber) {
        this.car.setModelNumber(modelNumber);
        return this;
    }

    public Builder setName(String name) {
        this.car.setName(name);
        return this;
    }

    public Builder setEngineName(String engineName) {
        this.car.setEngineName(engineName);
        return this;
    }

    public Builder setOwnerName(String ownerName) {
        this.car.setOwnerName(ownerName);
        return this;
    }

    public Builder setManufacturer(String manufacturer) {
        this.car.setManufacturer(manufacturer);
        return this;
    }

    public Builder setHasABS(boolean hasABS) {
        this.car.setHasABS(hasABS);
        return this;
    }

    public Builder setHasReverseParkingSensor(boolean hasReverseParkingSensor) {
        this.car.setHasReverseParkingSensor(hasReverseParkingSensor);
        return this;
    }

    public Builder setHasReverseParkingCamera(boolean hasReverseParkingCamera) {
        this.car.setHasReverseParkingCamera(hasReverseParkingCamera);
        return this;
    }

    public Builder setHasMultiMediaModule(boolean hasMultiMediaModule) {
        this.car.setHasMultiMediaModule(hasMultiMediaModule);
        return this;
    }

    public Car get() {
        return this.car;
    }
}
