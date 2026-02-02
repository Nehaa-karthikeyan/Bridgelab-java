package javacollectionsandstreams.iostreams;

import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("image.jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int data;
        while ((data = fis.read()) != -1) {
            baos.write(data);
        }

        byte[] imageBytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream("copy.jpg");

        while ((data = bais.read()) != -1) {
            fos.write(data);
        }

        System.out.println("Image copied successfully.");
    }
}

