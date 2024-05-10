package Recursion.Recursion_subset_string;

import java.util.ArrayList;

public class SubSeqAscii {
    public static void main(String[] args) {
        // subsequenceAscii("", "abc");
        System.out.println(subsequence1("", "abc"));
        
    }
    static void subsequenceAscii(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
         
        subsequenceAscii(p+ch, up.substring(1));
        subsequenceAscii(p, up.substring(1));
        subsequenceAscii(p + (ch + 0), up.substring(1));

    }
    // return the ascii value
    static ArrayList<String> subsequence1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         
        ArrayList<String> first  = subsequence1(p+ch, up.substring(1));
        ArrayList<String> second = subsequence1(p, up.substring(1));
        ArrayList<String> third = subsequence1(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
