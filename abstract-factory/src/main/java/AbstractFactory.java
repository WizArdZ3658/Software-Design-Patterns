import enums.CompanyIdentifier;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class AbstractFactory {

    private static final Map<CompanyIdentifier, Class<? extends IFactory>> registry = new HashMap<>();

    static {
        registry.put(CompanyIdentifier.TOYOTA, ToyotaFactory.class);
        registry.put(CompanyIdentifier.FORD, FordFactory.class);
    }

    public static IFactory getFactory(CompanyIdentifier identifier) {
        try {
            Class<? extends IFactory> companyFactory = registry.get(identifier);
            return companyFactory.getConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException();
        }
    }
}
