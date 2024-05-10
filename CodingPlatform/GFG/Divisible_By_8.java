package CodingPlatform.GFG;

public class Divisible_By_8{
    public static void main(String[] args) {

        String str = "16";
        System.out.println(divisible_By_8(str));
        
    }  
    public static int divisible_By_8(String s){

        if(s.length() == 0 ) return -1;

        int num = Integer.parseInt(s.substring(Math.max(0, s.length()-3)));

        if(num % 8 == 0) return 1;

        return -1;
    } 
}
