package CorePrograming.Extras.Java_Strings;
class DuplicateRemover {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }

    public static String removeDuplicates(String str) {
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        return result;
    }
}

