package pattern_homework.proxy;

public class ProxyConnector {
    public void connect(String dbName) {
        String url = "localhost:6666/";

        System.out.println("DB connection complete!\nURL: " + url + dbName);
    }
}
