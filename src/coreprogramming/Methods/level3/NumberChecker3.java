package CorePrograming.Methods.level3;
public class NumberChecker3 {

    // ----------------------------------------
    // BASIC DIGIT OPERATIONS
    // ----------------------------------------

    public static int countDigits(int num) {
        return Integer.toString(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = Integer.toString(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        int[] rev = reverseDigits(digits);
        return compareArrays(digits, rev);
    }

    public static boolean isDuck(int num) {
        int[] digits = storeDigits(num);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // ----------------------------------------
    // SPECIAL NUMBER CHECKS
    // ----------------------------------------

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num != 0) {
            int d = num % 10;
            sum += d;
            product *= d;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return Integer.toString(square).endsWith(Integer.toString(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    // ----------------------------------------
    // FACTORS AND NUMBER CLASSIFICATIONS
    // ----------------------------------------

    public static int[] factors(int num) {
        int count = 0;

        // count first
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] fact = new int[count];
        int index = 0;

        // store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) fact[index++] = i;
        }

        return fact;
    }

    public static int greatestFactor(int[] fact) {
        int max = fact[0];
        for (int f : fact) {
            if (f > max) max = f;
        }
        return max;
    }

    public static int sumFactors(int[] fact) {
        int sum = 0;
        for (int f : fact) sum += f;
        return sum;
    }

    public static long productFactors(int[] fact) {
        long product = 1;
        for (int f : fact) product *= f;
        return product;
    }

    public static long productCubeFactors(int[] fact) {
        long product = 1;
        for (int f : fact) product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfect(int num) {
        int[] fact = factors(num);
        int sum = 0;

        for (int f : fact) {
            if (f != num) sum += f; // proper divisors only
        }

        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int[] fact = factors(num);
        int sum = 0;

        for (int f : fact) {
            if (f != num) sum += f;
        }
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int[] fact = factors(num);
        int sum = 0;

        for (int f : fact) {
            if (f != num) sum += f;
        }
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num != 0) {
            int d = num % 10;

            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;

            sum += fact;
            num /= 10;
        }

        return sum == original;
    }

    // ----------------------------------------
    // MAIN METHOD TO DEMO ALL CHECKS
    // ----------------------------------------

    public static void main(String[] args) {

        int number = 145; // you can change this number to test

        System.out.println("Number: " + number);

        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Duck: " + isDuck(number));
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));

        int[] fact = factors(number);
        System.out.println("Greatest Factor: " + greatestFactor(fact));
        System.out.println("Sum of Factors: " + sumFactors(fact));
        System.out.println("Product of Factors: " + productFactors(fact));
        System.out.println("Product of Cube of Factors: " + productCubeFactors(fact));

        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }
}


