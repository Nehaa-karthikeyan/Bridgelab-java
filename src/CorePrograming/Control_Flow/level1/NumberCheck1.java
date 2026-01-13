package CorePrograming.Control_Flow.level1;
import java.util.Scanner;

public class NumberCheck1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        sc.close();
    }
}
