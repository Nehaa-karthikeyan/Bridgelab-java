package javacollectionsandstreams.exceptions;

class FakeConnection {

    void open() {
        System.out.println("Connection opened");
    }

    void close() {
        System.out.println("Connection closed");
    }

    void use() {
        throw new RuntimeException("Connection error");
    }
}

public class ConnectionDemo {

    public static void main(String[] args) {
        FakeConnection conn = new FakeConnection();

        try {
            conn.open();
            conn.use();
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            conn.close();
        }
    }
}

