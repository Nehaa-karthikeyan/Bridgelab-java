package CorePrograming.Strings.level3;
import java.util.Scanner;

public class FrequencyUnique {

    public static char[] uniqueChars(String text) {
        char[] arr = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean flag = true;

            for (int j = 0; j < i; j++)
                if (text.charAt(j) == c)
                    flag = false;

            if (flag) arr[k++] = c;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = arr[i];
        return result;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueChars(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = unique[i] + "";
            result[i][1] = freq[unique[i]] + "";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] arr = frequency(text);

        for (String[] a : arr)
            System.out.println(a[0] + " : " + a[1]);
    }
}


