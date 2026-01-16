package CorePrograming.Methods.level2;
import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if(age < 0) {
            return false; // invalid and cannot vote
        }
        if(age >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker svc = new StudentVoteChecker();

        int[] ages = new int[10];

        for(int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean result = svc.canStudentVote(ages[i]);

            if(result)
                System.out.println("Student can vote.");
            else
                System.out.println("Student cannot vote.");
        }
    }
}


