package CorePrograming.Methods.level1;
import java.util.Scanner;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int small = num1;
        int large = num1;

        if(num2 < small) small = num2;
        if(num3 < small) small = num3;

        if(num2 > large) large = num2;
        if(num3 > large) large = num3;

        return new int[]{small, large};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int n3 = sc.nextInt();

        int[] result = findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
    }
}


