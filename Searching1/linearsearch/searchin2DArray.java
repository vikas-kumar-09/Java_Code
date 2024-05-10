package Searching1.linearsearch;

import java.util.Arrays;

public class searchin2DArray {
    public static void main(String[] args) {
        
        int [] [] arr = {
            {2, 4, 12},
            {22, 33, 45, 15},
            {43, 14},
            {18, 46, 999, 38}
        };
        System.out.println((max(arr)));
        int target = 45;
        int [] ans = search(arr, target);  // format of return value is { row, col}
        System.out.println(search(arr, target));
        System.out.println(Arrays.toString(ans));
        System.out.println(Integer.MIN_VALUE);
    }
    // find maximum in 2d array
    static int max(int[][] arr){
         int max = Integer.MIN_VALUE;  // to find the max value 
        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
                
        //         if(arr[row][col] > max){
        //            max = arr[row][col];
        //         }
        //     }
        // }

        // using for each loop to find max value
        for(int[] ints: arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }

        }
         return max;
    }


    // searching elements in 2d array
    static int[] search(int[][] arr, int target){

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                
                if(arr[row][col] == target){
                   
                    return new int[]{row, col};
                }
            }
        }
         return new int[]{-1, -1};
    }
}
