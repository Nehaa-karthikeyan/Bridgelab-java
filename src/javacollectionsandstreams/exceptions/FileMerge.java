package javacollectionsandstreams.exceptions;

import java.io.*;

class FileMerge {

    public static void main(String[] args) {
        try (
                BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;

            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Files merged successfully into output.txt");

        } catch (IOException e) {
            System.out.println("File processing error");
        }
    }
}

