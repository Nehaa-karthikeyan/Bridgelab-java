package CorePrograming.Programing_Elements.level2;

import java.util.Scanner;

public class TemperatureConvention {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        sc.close();

    }

}
