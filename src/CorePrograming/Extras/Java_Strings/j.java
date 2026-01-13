package CorePrograming.Extras.Java_Strings;
class CaseToggler {
    public static void main(String[] args) {
        System.out.println(toggleCase("HeLLo"));
    }

    public static String toggleCase(String str) {
        String t = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
                t += (char)(ch - 32);
            else if(ch >= 'A' && ch <= 'Z')
                t += (char)(ch + 32);
            else
                t += ch;
        }
        return t;
    }
}
