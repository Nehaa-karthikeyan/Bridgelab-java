package CorePrograming.Strings.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generate() {
        String text = "Hello";
        System.out.println(text.substring(4, 2)); // start > end
    }

    public static void handle() {
        try {
            String text = "Hello";
            System.out.println(text.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}


