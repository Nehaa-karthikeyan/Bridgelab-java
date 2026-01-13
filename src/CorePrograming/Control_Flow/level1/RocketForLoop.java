package CorePrograming.Control_Flow.level1;

import java.util.Scanner;
public class RocketForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lanuch number");
        int count=sc.nextInt();
        for(int i=count;i>=1;i--) {
            count--;
            System.out.println(i);
        }
        System.out.println("blastttt");

    }

}
