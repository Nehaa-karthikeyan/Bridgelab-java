package CorePrograming.Arrays.Level2;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // b. Create arrays
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // c. Input height & weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();
        }

        // d. Calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]); // formula BMI = weight / height²

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // e. Display results
        System.out.println("\n---------------- BMI REPORT ----------------");
        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n", height[i], weight[i], bmi[i], status[i]);
        }
        System.out.println("--------------------------------------------");

        sc.close();
    }
}

