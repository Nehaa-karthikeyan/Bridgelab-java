package CorePrograming.Control_Flow.level1;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter years of service:");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
}
