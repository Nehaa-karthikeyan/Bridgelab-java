package CorePrograming.Extras.Built_in_functions;
import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().charAt(0);

        if (choice == 'C')
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        else
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
    }
}

