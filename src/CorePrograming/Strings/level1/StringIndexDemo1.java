package CorePrograming.Strings.level1;
import java.util.Scanner;

public class StringIndexDemo1 {

    public static void generate() {
        String text = "Hello";
        System.out.println(text.charAt(10)); // crash
    }

    public static void handle() {
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}


