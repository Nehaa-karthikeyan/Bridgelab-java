package CorePrograming.Methods.level3;

import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() → 0 to 0.999...
        // multiply by 900000 and add 100000 to ensure 6 digits
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to generate array of OTPs
    public static int[] generateOTPs(int size) {
        int[] otps = new int[size];

        for (int i = 0; i < size; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to ensure all OTPs are not same
    public static boolean isUnique(int[] otps) {
        int first = otps[0];

        for (int otp : otps) {
            if (otp != first) {
                return true; // Found different → unique
            }
        }
        return false; // All same
    }

    public static void main(String[] args) {

        int[] otps = generateOTPs(10);

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        if (isUnique(otps)) {
            System.out.println("\nResult: OTPs are UNIQUE.");
        } else {
            System.out.println("\nResult: OTPs are NOT UNIQUE.");
        }
    }
}


