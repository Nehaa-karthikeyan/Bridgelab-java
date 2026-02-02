package javacollectionsandstreams.iostreams;

import java.io.*;

public class BufferedVsNormal {
    public static void main(String[] args) throws IOException {

        byte[] buffer = new byte[4096];

        // Normal Streams
        long start1 = System.nanoTime();
        try (FileInputStream fis = new FileInputStream("bigfile.dat");
             FileOutputStream fos = new FileOutputStream("normalCopy.dat")) {

            int bytes;
            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }
        }
        long end1 = System.nanoTime();

        // Buffered Streams
        long start2 = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bigfile.dat"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufferedCopy.dat"))) {

            int bytes;
            while ((bytes = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytes);
            }
        }
        long end2 = System.nanoTime();

        System.out.println("Normal Time: " + (end1 - start1));
        System.out.println("Buffered Time: " + (end2 - start2));
    }
}

