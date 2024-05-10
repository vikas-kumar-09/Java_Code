package Recursion.Recursion_Pattern_Question;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {4, 3, 1, 2};
        bubble_Sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble_Sort(int[] arr, int r, int c){

        if( r == 0){
            return;
        }
        if(c < r){

            if(arr[c] < arr[r]){
                // swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble_Sort(arr, r, c+1);
        }
        else{
            bubble_Sort(arr, r-1, 0);
        }
    }
}
