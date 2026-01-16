package CorePrograming.Extras.Java_Strings;
class MostFrequentChar {
    public static void main(String[] args) {
        System.out.println(mostFrequent("success"));
    }

    public static char mostFrequent(String str) {
        int max = 0;
        char result = ' ';

        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if(count > max){
                max = count;
                result = str.charAt(i);
            }
        }
        return result;
    }
}
