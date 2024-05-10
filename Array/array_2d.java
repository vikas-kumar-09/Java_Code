package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        
        /*
         1, 2, 3
         4, 5, 6
         7, 8, 9
         */

         // syntax of 2d array 

        //  int[][] arr = new int[3][];

        //  int[][] arr = {
        //     {1, 2, 3,},  // 0th index
        //     {4, 5}, // 1st index
        //     {6, 7, 8, 9}, // 2nd index ...arr[2] = {6, 7, 8, 9}

        //  };
        //  int[][] arr = new int[3][4];
        //  System.out.println(arr.length);
        //  input.close();

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
      //   input.close();

         // Inpput in 2d array
         
         for(int row = 0; row<arr.length; row++){
            // for each col in every row
            for(int col = 0 ; col<arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
         }
         // output in 2d array
         for(int row = 0; row<arr.length; row++){
            // for each col in every row
            for(int col = 0 ; col<arr[row].length; col++){
               System.out.print(arr[row][col] + " ");
            }
            System.out.println();
            System.out.println(Arrays.toString(arr[row]));
         }

         // Enhance for loop
         for(int[] a : arr){
            System.out.println(Arrays.toString(a));
         }
         input.close();
    }
    
}
