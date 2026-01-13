package CorePrograming.Arrays.Level1;
import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[10]; // array of 10 students

        System.out.println("Enter the age of 10 students:");

        // taking input
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Result:\n");

        // checking eligibility
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid age entered: " + age[i]);
            } else if (age[i] >= 18) {
                System.out.println("The student with age " + age[i] + " can vote.");
            } else {
                System.out.println("The student with age " + age[i] + " cannot vote.");
            }
        }
    }
}


