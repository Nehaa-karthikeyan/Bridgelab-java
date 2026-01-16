package CorePrograming.Strings.level1;
import java.util.Scanner;

public class NumberFormatDemo {

    public static void generate() {
        String text = "abc";
        int num = Integer.parseInt(text); // crash
    }

    public static void handle() {
        try {
            String text = "abc";
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException!");
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}

