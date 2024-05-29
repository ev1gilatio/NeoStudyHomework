package pattern_homework.factory;

public class CoffeeFactory {

    public Coffee getCoffee(CoffeeType type) {
        Coffee coffee;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            default:
                throw new RuntimeException("Invalid type of coffee");
        }

        return coffee;
    }
}
