package javacollectionsandstreams.exceptions;

import java.io.*;

class ExceptionTypesDemo {

    static void processData() throws IOException {
        if (Math.random() > 0.5) {
            throw new IOException("Checked Exception occurred");
        } else {
            throw new RuntimeException("Unchecked Exception occurred");
        }
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (IOException e) {
            System.out.println("Handled checked exception");
        } catch (RuntimeException e) {
            System.out.println("Handled unchecked exception");
        }
    }
}
