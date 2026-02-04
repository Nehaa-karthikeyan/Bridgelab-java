package javacollectionsandstreams.exceptions;

import java.io.*;
import java.util.*;

class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            System.out.println("Reading file: " + path);

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
            }
        }
    }

    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor();
        List<String> files = Arrays.asList("file1.txt", "file2.txt");
        fp.processFiles(files);
    }
}

