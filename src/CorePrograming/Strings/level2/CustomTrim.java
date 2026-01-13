package CorePrograming.Strings.level2;
import java.util.Scanner;

public class CustomTrim {

    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ')
            start++;

        while (end >= start && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    public static String customSubstring(String text, int s, int e) {
        String res = "";
        for (int i = s; i <= e; i++)
            res += text.charAt(i);

        return res;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = trimIndexes(text);
        String custom = customSubstring(text, idx[0], idx[1]);
        String builtin = text.trim();

        System.out.println("Custom trim = " + custom);
        System.out.println("Match = " + compare(custom, builtin));
    }
}


