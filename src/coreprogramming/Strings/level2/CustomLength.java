package CorePrograming.Strings.level2;
import java.util.Scanner;

public class CustomLength {

    public static int customLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.next();

        int custom = customLength(input);
        int builtin = input.length();

        System.out.println("Custom Length = " + custom);
        System.out.println("Built-in Length = " + builtin);
    }
}

