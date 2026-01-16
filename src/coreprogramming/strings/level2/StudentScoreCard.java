package CorePrograming.Strings.level2;
import java.util.Random;

public class StudentScoreCard {

    // Method A: Generate random 2 digit scores for PCM
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // random 60-100 (2 digit)
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    // Method B: Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3];

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method C: Calculate grade based on percentage
    public static char[] calculateGrades(double[][] results) {
        int n = results.length;
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 60) grades[i] = 'C';
            else if (percentage >= 50) grades[i] = 'D';
            else if (percentage >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    // Method D: Display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, char[] grades) {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("ID   PHY   CHE   MAT   TOTAL   AVG     %     GRADE");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-5d %-5d %-5d %-7.0f %-7.2f %-7.2f %-3c\n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {

        int n = 5; // number of students → you can change this

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        char[] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);
    }
}


