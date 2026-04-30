package A.resources;

public class DBConnection
        implements AutoCloseable {

    public DBConnection() {
        start();
    }

    public void start() {
        System.out.println("open connection");
    }

    public void executeQuery() {
        System.out.println("Exec query...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing db connection...");
    }

}
