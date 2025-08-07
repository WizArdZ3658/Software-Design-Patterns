import enums.VehicleType;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class FordFactory implements IFactory {

    private static final Map<VehicleType, Class<? extends IVehicle>> registry = new HashMap<>();

    static {
        registry.put(VehicleType.BIKE, Bike.class);
        registry.put(VehicleType.TRUCK, Truck.class);
        registry.put(VehicleType.CAR, Car.class);
    }

    @Override
    public IVehicle getVehicle(VehicleType type) {

        try {
            Class<? extends IVehicle> vehicleClass = registry.get(type);
            return vehicleClass.getConstructor(String.class).newInstance("ford");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
