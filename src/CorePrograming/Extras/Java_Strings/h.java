package CorePrograming.Extras.Java_Strings;
class LongestWordFinder {
    public static void main(String[] args) {
        System.out.println(longestWord("Java is wonderful language"));
    }

    public static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }
        return longest;
    }
}

