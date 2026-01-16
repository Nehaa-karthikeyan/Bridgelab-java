package CorePrograming.Strings.level3;
import java.util.Scanner;

public class FirstNonRepeat {

    public static char firstNonRepeat(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++)
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);

        return '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char ans = firstNonRepeat(text);

        if (ans != '-')
            System.out.println("First non repeating: " + ans);
        else
            System.out.println("No non-repeating character.");
    }
}


