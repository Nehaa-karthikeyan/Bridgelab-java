package CorePrograming.Methods.level3;
public class NumberChecker1 {

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

    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        int num = 0;
        for (int d : digits) num = num * 10 + d;

        return sum == num;
    }

    public static int[] largestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] smallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {

        int number = 153;

        int[] digits = storeDigits(number);

        System.out.println("Digits count: " + countDigits(number));
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(digits));

        int[] big = largestTwo(digits);
        System.out.println("Largest: " + big[0] + ", Second Largest: " + big[1]);

        int[] small = smallestTwo(digits);
        System.out.println("Smallest: " + small[0] + ", Second Smallest: " + small[1]);
    }
}


