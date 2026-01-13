package CorePrograming.Methods.level3;
public class NumberChecker2 {

    public static int countDigits(int num) {
        return Integer.toString(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = Integer.toString(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    public static int[][] frequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        int number = 21;

        int[] digits = storeDigits(number);

        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));

        int[][] freq = frequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println(freq[i][0] + " → " + freq[i][1]);
        }
    }
}


