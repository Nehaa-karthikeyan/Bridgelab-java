package CorePrograming.Control_Flow.level1;
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number % 5 == 0) {
            System.out.println("Yes the number is divisible by 5");
        }
        else {
            System.out.println("No the number is Not divisible by 5");
        }
    }
}
