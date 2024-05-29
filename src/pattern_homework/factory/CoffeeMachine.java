package pattern_homework.factory;

public class CoffeeMachine {
    private final CoffeeFactory factory;

    public CoffeeMachine() {
        factory = new CoffeeFactory();
    }

    public void startBrewing(CoffeeType type) {
        factory.getCoffee(type).brewing();
    }
}
