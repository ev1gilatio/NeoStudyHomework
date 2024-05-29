package pattern_homework.factory;

public class Espresso extends Coffee {
    public Espresso() {
        coffeePercentage = 50;
        waterPercentage = 50;
    }

    @Override
    public void brewing() {
        System.out.println("Start brewing Espresso...\nCoffee percentage: 50\nWater percentage: 50");
    }
}
