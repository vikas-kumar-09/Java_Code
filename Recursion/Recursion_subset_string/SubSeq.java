package Recursion.Recursion_subset_string;

import java.util.ArrayList;

// subsets for array
// subsequence for string
public class SubSeq {
    public static void main(String[] args) {
        // subsequence(" ", "abc");
        System.out.println(subsequenceReturn("","abc"));
        
    }
    static void subsequence(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
         
        subsequence(p+ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    // return an arraylist in java inside the body of a function
    static ArrayList<String> subsequenceReturn(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         
        ArrayList<String> left  = subsequenceReturn(p+ch, up.substring(1));
        ArrayList<String> right = subsequenceReturn(p, up.substring(1));

        left.addAll(right);
        return left;

    }
    // SubSeq of ascii value
    
}
