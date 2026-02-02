package javacollectionsandstreams.iostreams;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        br.close();

        map.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}

