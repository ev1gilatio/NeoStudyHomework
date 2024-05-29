package pattern_homework;

import pattern_homework.adapter.Computer;
import pattern_homework.adapter.FlashDrive;
import pattern_homework.adapter.MemoryCard;
import pattern_homework.adapter.USBAdapter;
import pattern_homework.factory.CoffeeMachine;
import pattern_homework.factory.CoffeeType;
import pattern_homework.proxy.DBConnector;
import pattern_homework.proxy.ProxyConnector;
import pattern_homework.singleton.LoggerSingleton;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        FlashDrive flashDrive = new FlashDrive();
        computer.readSource(flashDrive);

        MemoryCard memCard = new MemoryCard();
        USBAdapter adapter = new USBAdapter(memCard);
        computer.readSource(adapter);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.startBrewing(CoffeeType.AMERICANO);

        ProxyConnector proxyConnector = new ProxyConnector();
        DBConnector connector = new DBConnector("Evig_DB", proxyConnector);
        connector.connectToDB();

        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.classLogg(Main.class, "method main");
    }
}
