package CodingPlatform.GFG;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=3&sortBy=submissions

public class Reverse_array_in_groups {

    public static void main(String[] args){
        
          int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //   reverseInGroup(arr, arr.length, 3);
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
              
        }
        System.out.println();
        int k = 3;
        int n = arr.length;
        reverseInGroup(arr, n, k);
          for(int i=0; i<arr.length; i++){
             System.out.print(arr[i] + " ");
          }

    }
    static void reverseInGroup(int[] arr, int n, int k){

        for(int i=0; i<n; i=i+k){

            int start = 0;

            int end = Math.min(i+k-1, n-1);

            while (start < end){
                
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
