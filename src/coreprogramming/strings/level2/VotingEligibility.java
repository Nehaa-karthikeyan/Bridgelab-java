package CorePrograming.Strings.level2;

import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = r.nextInt(90); // 0 to 89

        return arr;
    }

    public static String[][] checkVote(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0)
                result[i][1] = "False";
            else if (ages[i] >= 18)
                result[i][1] = "True";
            else
                result[i][1] = "False";
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Age\tCan Vote?");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        display(checkVote(ages));
    }
}


