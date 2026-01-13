package CorePrograming.Strings.level3;
import java.util.Scanner;

                     public class UniqueCharacters1 {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] uniqueChars(String text) {
        int len = findLength(text);
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean flag = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                unique[index++] = c;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] arr = uniqueChars(text);

        System.out.print("Unique characters: ");
        for (char c : arr) System.out.print(c + " ");
    }
}


