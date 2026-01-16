package CorePrograming.Arrays.Level2;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        // b. Arrays to store marks, percentages, and grades
        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print(subject + " Marks: ");
                int mark = sc.nextInt();

                // validation (negative marks)
                if (mark < 0) {
                    System.out.println("Invalid! Marks cannot be negative. Enter again.");
                    j--; // repeat same subject input
                } else {
                    marks[i][j] = mark; // store mark
                }
            }

            // d. Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (total / 300.0) * 100;
            percentages[i] = percentage;

            // d. Calculate grade based on percentage
            if (percentage >= 80)
                grades[i] = 'A';
            else if (percentage >= 70)
                grades[i] = 'B';
            else if (percentage >= 60)
                grades[i] = 'C';
            else if (percentage >= 50)
                grades[i] = 'D';
            else if (percentage >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }

        // e. Display results
        System.out.println("\n--- STUDENT MARKS, PERCENTAGES & GRADES ---");

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }

        sc.close();
    }
}


