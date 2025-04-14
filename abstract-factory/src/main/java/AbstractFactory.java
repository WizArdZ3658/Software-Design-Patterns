import java.util.Objects;

public class AbstractFactory {
    public static IFactory getFactory(String identifier) {
        if (Objects.equals(identifier, "toyota")) {
            return new ToyotaFactory();
        } else if (Objects.equals(identifier, "ford")) {
            return new FordFactory();
        } else {
            return new FordFactory();
        }
    }
}
