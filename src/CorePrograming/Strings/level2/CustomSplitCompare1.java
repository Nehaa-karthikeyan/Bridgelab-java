package CorePrograming.Strings.level2;
import java.util.Scanner;

public class CustomSplitCompare1 {

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

    public static String[] customSplit(String text) {
        int length = customLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int index = 0;
        String temp = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp;

        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Arrays Equal = " + compareArrays(custom, builtin));
    }
}


