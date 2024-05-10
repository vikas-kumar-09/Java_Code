package Strings;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "rat";
        System.out.println(str);
        System.out.println(reverse_String(str));
        
    }
    static String reverse_String(String Str){

        String newStr = "";
        char[] ch = Str.toCharArray();

        for(int i=Str.length()-1; i>=0; i--){

            newStr+= ch[i];
        }
        return newStr.toString();
    } 
}
