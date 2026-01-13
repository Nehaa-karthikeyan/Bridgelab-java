package CorePrograming.Methods.level3;
import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random scores for students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(51) + 50; // Generate 2-digit marks from 50 to 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / 3;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            for (int k = 0; k < 3; k++) {
                System.out.print(results[i][k] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);

        sc.close();
    }
}


