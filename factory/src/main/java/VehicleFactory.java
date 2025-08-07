import enums.VehicleType;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VehicleFactory {

    private static final Map<VehicleType, Class<? extends IVehicle>> registry;

    static {
        registry = new HashMap<>();
        registry.put(VehicleType.BIKE, Bike.class);
        registry.put(VehicleType.TRUCK, Truck.class);
    }

    public static IVehicle getInstance(VehicleType type)  {
        try {
            Class<? extends IVehicle> vehicleClass = registry.get(type);
            return vehicleClass.getConstructor().newInstance();
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}
