import enums.VehicleType;

public interface IFactory {

    IVehicle getVehicle(VehicleType type);
}
