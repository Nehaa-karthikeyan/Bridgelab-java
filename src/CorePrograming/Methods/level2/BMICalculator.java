package CorePrograming.Methods.level2;
import java.util.*;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10 rows, 3 columns → weight, height, BMI
        double[][] data = new double[10][3];
        String[] status = new String[10];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i+1) + " Weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Person " + (i+1) + " Height (cm): ");
            data[i][1] = sc.nextDouble();

            // Calculate BMI
            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            // BMI status
            status[i] = bmiStatus(data[i][2]);
        }

        System.out.println("\n==== BMI REPORT ====");
        System.out.println("Weight\tHeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}


