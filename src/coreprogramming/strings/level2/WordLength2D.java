package CorePrograming.Strings.level2;
import java.util.Scanner;

public class WordLength2D {

    public static int customLength(String str) {
        int cnt = 0;
        try {
            while (true) {
                str.charAt(cnt);
                cnt++;
            }
        } catch (Exception e) {}
        return cnt;
    }

    public static String[] customSplit(String text) {
        int length = customLength(text);
        int wc = 1;
        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ') wc++;

        String[] arr = new String[wc];
        int idx = 0;
        String temp = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ')
                temp += text.charAt(i);
            else {
                arr[idx++] = temp;
                temp = "";
            }
        }
        arr[idx] = temp;

        return arr;
    }

    public static String[][] make2D(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] twoD = make2D(words);

        System.out.println("Word\tLength");
        for (String[] arr : twoD) {
            System.out.println(arr[0] + "\t" + Integer.valueOf(arr[1]));
        }
    }
}


