package CorePrograming.Strings.level3;
import java.util.Scanner;

public class FrequencyNested {

    public static String[] frequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        String[] res = new String[chars.length];
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                res[k] = chars[i] + " : " + freq[i];
                k++;
            }
        }

        String[] output = new String[k];
        for (int i = 0; i < k; i++) output[i] = res[i];

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] arr = frequency(text);

        for (String s : arr)
            System.out.println(s);
    }
}

