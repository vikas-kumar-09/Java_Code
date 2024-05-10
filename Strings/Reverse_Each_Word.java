package Strings;

// Reverse words in a given string
public class Reverse_Each_Word {
    public static void main(String[] args) {
        String str1 ="Hello World";
        System.out.println(reverseWord(str1));
        
    }
    static String reverseWord(String str){

        String [] words = str.split(" ");

        StringBuilder reversed = new StringBuilder();
        for(int i=words.length()-1; i>=0; i--){
            reversed.append(words[i]);
        }
        if(i > 0){
            reversed.append(" ");
        }
        return reversed.toString();
    }
}
