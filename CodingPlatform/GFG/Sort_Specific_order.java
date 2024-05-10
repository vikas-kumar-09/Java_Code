package CodingPlatform.GFG;

import java.util.ArrayList;
import java.util.*;
// https://www.geeksforgeeks.org/problems/sort-in-specific-order2422/1?page=1&category=Sorting&difficulty=Basic&sortBy=submissions
public class Sort_Specific_order {
    public static void main(String[] args) {
        
    }

    static void sortIt(int arr[], int n){

        ArrayList<Integer> odd = new ArrayList<>();
         ArrayList<Integer> even = new ArrayList<>();

         for(int i=0; i<n; i++){

            if(n % 2 == 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
            Collections.sort(even);
            Collections.sort(odd);
         }

    }
}
