package CorePrograming.Methods.level3;
import java.util.Random;

public class FootballTeamStats {

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random r = new Random();

        // Generate heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = r.nextInt(101) + 150;
        }

        System.out.println("Heights of players:");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nShortest Player: " + findShortest(heights));
        System.out.println("Tallest Player: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}


