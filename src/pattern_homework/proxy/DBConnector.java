package pattern_homework.proxy;

public class DBConnector {
    private final String dbName;
    private final ProxyConnector proxy;

    public DBConnector(String dbName, ProxyConnector proxy) {
        this.dbName = dbName;
        this.proxy = proxy;
    }

    public void connectToDB() {
        proxy.connect(dbName);
    }
}
