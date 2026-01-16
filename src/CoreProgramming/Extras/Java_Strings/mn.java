package CorePrograming.Extras.Java_Strings;
class WordReplacer {
    public static void main(String[] args) {
        System.out.println(replaceWord("Java is fun. Java is powerful.", "Java", "Python"));
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for(String w : words) {
            if(w.equals(oldWord))
                result += newWord + " ";
            else
                result += w + " ";
        }
        return result.trim();
    }
}


