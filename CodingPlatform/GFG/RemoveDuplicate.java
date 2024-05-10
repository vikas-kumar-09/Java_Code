package CodingPlatform.GFG;

import java.util.ArrayList;
// import java.util.HashSet;

// https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1?page=1&category=Strings&difficulty=Easy&sortBy=submissions
public class RemoveDuplicate {
    public static void main(String[] args){
        String str1 = "abbc";
        System.out.println(RemoveDuplicate1(str1));

    }
    static String RemoveDuplicate1( String S){

        ArrayList<Character> seen = new ArrayList<>();

        StringBuilder ans = new StringBuilder();

        for(char c : S.toCharArray()){

            if(!seen.contains(c)){
                seen.add(c);
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
    

