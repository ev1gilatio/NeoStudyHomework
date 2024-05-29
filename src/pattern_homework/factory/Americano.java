package pattern_homework.factory;

public class Americano extends Coffee {
    public Americano() {
        coffeePercentage = 25;
        waterPercentage = 75;
    }

    @Override
    public void brewing() {
        System.out.println("Start brewing Americano...\nCoffee percentage: 25\nWater percentage: 75");
    }
}
