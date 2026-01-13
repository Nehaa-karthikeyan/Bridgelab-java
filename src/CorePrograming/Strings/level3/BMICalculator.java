package CorePrograming.Strings.level3;
import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI & Status
    public static String[][] computeBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];

        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];

            double heightM = heightCm / 100; // convert cm to m
            double bmi = weight / (heightM * heightM);

            String status = "";

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 24.9)
                status = "Normal";
            else if (bmi < 29.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Display method
    public static void display(String[][] arr) {
        System.out.println("\n-------------------------------------------");
        System.out.println("Height(cm)  Weight(kg)    BMI     Status");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-12s %-12s %-7s %-10s\n",
                    arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
        }

        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        System.out.println("Enter height(cm) & weight(kg) of 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Height(cm): ");
            hw[i][1] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " Weight(kg): ");
            hw[i][0] = sc.nextDouble();
        }

        String[][] result = computeBMI(hw);
        display(result);
    }
}

