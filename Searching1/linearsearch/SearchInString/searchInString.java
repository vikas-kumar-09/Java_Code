package Searching1.linearsearch.SearchInString;

// import java.util.Arrays;

// Search In String
public class searchInString {
    public static void main(String[] args) {
        String name = "vikaskumar";
        char target = 'h';
        System.out.println(search2(name, target));    
        // System.out.println(Arrays.toString(name.toCharArray()));
        
    }
    // using for-each loop
    static boolean search2(String str , char target){

        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    // search character  in the string 
    // using for loop
    static boolean search(String str , char target){

        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){

            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
