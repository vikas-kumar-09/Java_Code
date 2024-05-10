package Recursion.Recursion_Permutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        // permutation("", "abc");
        // System.out.println(permutation1("", "abc"));

        // ArrayList<String> ans = permutation1("", "abcd");
        // System.out.println(ans);

        System.out.println(permutationCount("", "abc"));
        
    }
    static void permutation(String p, String up){
          if(up.isEmpty()){
            System.out.println(p);
            return;
          }
          char ch = up.charAt(0);

          for(int i=0; i<=p.length(); i++){

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first+ch+second, up.substring(1));
          }
    }

    // return the string
    static ArrayList<String> permutation1(String p, String up){
          if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
          char ch = up.charAt(0);

          ArrayList<String> ans = new ArrayList<>();

          for(int i=0; i<=p.length(); i++){

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutation1(first+ch+second, up.substring(1)));
          }
          return ans;
    }

      // count the subsets of a string
     static int permutationCount(String p, String up){
          if(up.isEmpty()){
            return 1;
          }
          int count = 0;
          char ch = up.charAt(0);

          for(int i=0; i<=p.length(); i++){

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationCount(first+ch+second, up.substring(1));
          }
           return count;   
        }

    }
   
