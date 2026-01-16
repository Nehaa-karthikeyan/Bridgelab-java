package CorePrograming.Arrays.Level2;
import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // 2D array → [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid! Weight must be positive.");
                }
            } while (weight <= 0);

            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid! Height must be positive.");
                }
            } while (height <= 0);

            // store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine Weight Status
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi >= 18.5 && bmi < 24.9)
                weightStatus[i] = "Normal";
            else if (bmi >= 25 && bmi < 29.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display Results
        System.out.println("\n--- BMI DETAILS OF ALL PERSONS ---");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}


