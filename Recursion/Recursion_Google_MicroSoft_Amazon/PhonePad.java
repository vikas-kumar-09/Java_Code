package Recursion.Recursion_Google_MicroSoft_Amazon;

import java.util.ArrayList;

// Letter combination of a phone number
public class PhonePad {
    public static void main(String[] args) {
        // phonePad("", "12");
        // System.out.println(phonePadRet("", "12"));
        System.out.println(phonePadCount("", "12"));
        
    }
    static void phonePad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

        for(int i=(digit-1)*3; i<digit * 3; i++){
            char ch = (char)('a' + i);
            phonePad(p + ch, up.substring(1));
        }
    }

    // return the ArrayList
    static ArrayList<String> phonePadRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

         // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for(int i=(digit-1)*3; i<digit * 3; i++){
            char ch = (char)('a' + i);
            ans.addAll(phonePadRet(p + ch, up.substring(1)));
        }
        return ans;
    }
    
    // count the subsets of a string recursion
    static int  phonePadCount(String p, String up){
        if(up.isEmpty()){
            // System.out.println(p);
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

        for(int i=(digit-1)*3; i<digit * 3; i++){
            char ch = (char)('a' + i);
            count = count + phonePadCount(p + ch, up.substring(1));
        }
        return count;
    }
}
