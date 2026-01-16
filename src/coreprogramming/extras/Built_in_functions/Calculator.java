package CorePrograming.Extras.Built_in_functions;
import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static int divide(int a, int b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println(add(a, b));
            case 2 -> System.out.println(subtract(a, b));
            case 3 -> System.out.println(multiply(a, b));
            case 4 -> System.out.println(divide(a, b));
            default -> System.out.println("Invalid choice");
        }
    }
}

