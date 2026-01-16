package CorePrograming.Programing_Elements.level1;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2;
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        number2 = input.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers " +
                        number1 + " and " + number2 + " are:\n" +
                        "Addition = " + addition + "\n" +
                        "Subtraction = " + subtraction + "\n" +
                        "Multiplication = " + multiplication + "\n" +
                        "Division = " + division);
    }
}
