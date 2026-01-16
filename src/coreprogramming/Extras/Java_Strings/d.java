package CorePrograming.Extras.Java_Strings;
class StringReverser {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}