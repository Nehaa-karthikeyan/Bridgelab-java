package CorePrograming.Extras.Java_Strings;
class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    public static boolean isPalindrome(String str) {
        String rev = reverse(str);
        return str.equals(rev);
    }

    public static String reverse(String str) {
        String r = "";
        for(int i = str.length()-1; i >= 0; i--) {
            r += str.charAt(i);
        }
        return r;
    }
}

