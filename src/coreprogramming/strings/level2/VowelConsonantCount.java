package CorePrograming.Strings.level2;
import java.util.Scanner;

public class VowelConsonantCount {

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

    public static int[] countVC(String text) {
        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {
            String res = check(text.charAt(i));
            if (res.equals("Vowel")) v++;
            if (res.equals("Consonant")) c++;
        }

        return new int[]{v, c};
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String t = sc.nextLine();

        int[] res = countVC(t);

        System.out.println("Vowels = " + res[0]);
        System.out.println("Consonants = " + res[1]);
    }
}


