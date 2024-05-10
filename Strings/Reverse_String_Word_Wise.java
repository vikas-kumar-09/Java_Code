package Strings;


// Reverse each charcter in the given word
public class Reverse_String_Word_Wise {
    public static void main(String[] args) {

        String str ="vikas kumar";
        System.out.println(reverseString(str));
        
    }
    static String reverseString(String str){

        String [] words = str.split(" ");

        StringBuilder reverseWord = new StringBuilder(); 

        for(String s : words){
            StringBuilder sb = new StringBuilder(s);

            sb.reverse();
            reverseWord.append(sb).append(" ");
        }
        return reverseWord.toString();

    }

    // Alternative Approach

}
