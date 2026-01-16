package CorePrograming.Methods.level1;
import java.util.Scanner;

public class HandshakeCalculator {

    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int result = maxHandshakes(n);

        System.out.println("Maximum number of handshakes possible = " + result);
    }
}


