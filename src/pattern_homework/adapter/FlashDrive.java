package pattern_homework.adapter;

public class FlashDrive implements USBConnection {

    @Override
    public void read() {
        System.out.println("Reading from flash drive");
    }
}
