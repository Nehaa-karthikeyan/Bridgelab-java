package CorePrograming.Strings.level2;
import java.util.Scanner;

public class ShortLongWords {

    public static int customLength(String str) {
        int c = 0;
        try {
            while (true) {
                str.charAt(c);
                c++;
            }
        } catch (Exception e) {}
        return c;
    }

    public static String[] customSplit(String text) {
        int l = customLength(text), wc = 1;
        for (int i = 0; i < l; i++) if (text.charAt(i) == ' ') wc++;

        String[] arr = new String[wc];
        int idx = 0;
        String t = "";

        for (int i = 0; i < l; i++) {
            if (text.charAt(i) != ' ')
                t += text.charAt(i);
            else {
                arr[idx++] = t;
                t = "";
            }
        }
        arr[idx] = t;

        return arr;
    }

    public static int[] findMinMax(String[] words) {
        int min = customLength(words[0]);
        int max = customLength(words[0]);

        for (String w : words) {
            int len = customLength(w);
            if (len < min) min = len;
            if (len > max) max = len;
        }

        return new int[]{min, max};
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        int[] res = findMinMax(words);

        System.out.println("Shortest Length = " + res[0]);
        System.out.println("Longest Length  = " + res[1]);
    }
}


