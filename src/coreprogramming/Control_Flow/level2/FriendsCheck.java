package CorePrograming.Control_Flow.level2;
import java.util.Scanner;
public class FriendsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageA, ageB, ageC;
        double hA, hB, hC;
        System.out.println("Enter Amar's age and height:");
        ageA = sc.nextInt();
        hA = sc.nextDouble();
        System.out.println("Enter Akbar's age and height:");
        ageB = sc.nextInt();
        hB = sc.nextDouble();
        System.out.println("Enter Anthony's age and height:");
        ageC = sc.nextInt();
        hC = sc.nextDouble();
        if (ageA < ageB && ageA < ageC)
            System.out.println("Amar is the youngest");
        else if (ageB < ageA && ageB < ageC)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");
        if (hA > hB && hA > hC)
            System.out.println("Amar is the tallest");
        else if (hB > hA && hB > hC)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}


