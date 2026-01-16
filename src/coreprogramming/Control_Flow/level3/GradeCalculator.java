package CorePrograming.Control_Flow.level3;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        float physics = sc.nextFloat();
        System.out.print("Enter Chemistry marks: ");
        float chemistry = sc.nextFloat();
        System.out.print("Enter Maths marks: ");
        float maths = sc.nextFloat();
        float average = (physics + chemistry + maths) / 3;
        String grade = "";
        String remarks = "";
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        }
        else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        }
        else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        }
        else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        }
        else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        }
        else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output
        System.out.println("\n----- RESULT -----");
        System.out.println("Average Mark: " + average + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}


