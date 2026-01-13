package CorePrograming.Extras.Built_in_functions;
import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}

