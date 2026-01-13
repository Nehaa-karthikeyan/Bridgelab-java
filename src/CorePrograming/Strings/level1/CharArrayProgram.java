package CorePrograming.Strings.level1;
import java.util.Scanner;

public class CharArrayProgram {

    public static char[] customCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] custom = customCharArray(text);
        char[] builtin = text.toCharArray();

        System.out.println("Result Match = " + compare(custom, builtin));
    }
}


