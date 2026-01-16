package CorePrograming.Extras.Built_in_functions;
import java.util.Scanner;

public class MaximumOfThree {

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum: " + findMax(a, b, c));
    }
}

