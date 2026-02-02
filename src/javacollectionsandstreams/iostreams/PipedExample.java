package javacollectionsandstreams.iostreams;

import java.io.*;

public class PipedExample {
    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello from Writer".getBytes());
                pos.close();
            } catch (IOException e) {}
        });

        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {}
        });

        writer.start();
        reader.start();
    }
}

