package CorePrograming.Strings.level2;
import java.util.Scanner;

public class VowelConsonantTable {

    public static String check(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1)
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] make2D(String text) {
        String[][] arr = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            arr[i][0] = String.valueOf(text.charAt(i));
            arr[i][1] = check(text.charAt(i));
        }
        return arr;
    }

    public static void display(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        display(make2D(text));
    }
}


