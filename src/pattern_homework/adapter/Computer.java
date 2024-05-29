package pattern_homework.adapter;

public class Computer {
    public void readSource(USBConnection connection) {
        connection.read();
    }
}
