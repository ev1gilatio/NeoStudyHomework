package pattern_homework.adapter;

public class USBAdapter implements USBConnection {
    MemoryCard memCard;

    public USBAdapter(MemoryCard memCard) {
        this.memCard = memCard;
    }

    @Override
    public void read() {
        System.out.println("Memory card was connected to USB adapter");
        memCard.read();
    }
}
