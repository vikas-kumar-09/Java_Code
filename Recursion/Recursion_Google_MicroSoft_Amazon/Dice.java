package Recursion.Recursion_Google_MicroSoft_Amazon;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        // dice("", 4);
        // System.out.println(diceCount("", 4));
        System.out.println(diceReturn("", 4));
        
    }
    static void dice(String p, int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            dice(p + i, target - i);
        }
    }

    // return the total numbers of ways in order to form 4 in s dice
     static int diceCount(String p, int target){
        if (target == 0) {
            // System.out.println(p);
            return 1;
        }
           int count = 0;
        for(int i = 1; i <= 6 && i <= target; i++){
            count = count + diceCount(p + i, target - i);
        }
        return count;
    }
    // return the arrayList

    static ArrayList<String> diceReturn(String p, int target){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(diceReturn(p + i, target - i));
            
        }
        return ans;
    }
}
