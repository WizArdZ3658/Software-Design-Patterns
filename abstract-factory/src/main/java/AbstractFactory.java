public class AbstractFactory {
    public static IFactory getFactory(String identifier) {
        if (identifier == "toyota") {
            return new ToyotaFactory();
        } else if (identifier == "ford") {
            return new FordFactory();
        } else {
            return new FordFactory();
        }
    }
}
