package CorePrograming.Control_Flow.level2;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Factors are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        } else {
            System.out.println("Not a positive number.");
        }
    }
}
