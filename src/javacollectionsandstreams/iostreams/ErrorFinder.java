package javacollectionsandstreams.iostreams;

import java.io.*;

public class ErrorFinder {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("large.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
