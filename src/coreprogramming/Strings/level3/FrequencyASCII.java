package CorePrograming.Strings.level3;
import java.util.Scanner;

public class FrequencyASCII {

    public static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        String[][] arr = new String[text.length()][2];
        int index = 0;

        boolean[] visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (!visited[c]) {
                visited[c] = true;
                arr[index][0] = c + "";
                arr[index][1] = freq[c] + "";
                index++;
            }
        }

        String[][] result = new String[index][2];
        for (int i = 0; i < index; i++)
            result[i] = arr[i];

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


