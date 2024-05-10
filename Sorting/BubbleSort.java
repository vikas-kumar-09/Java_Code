package Sorting;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        // int[] arr1 = {5, 4, 88, 1, 2, 9};
           int[] arr1 = {3, 5, 66, 8};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        
    }
    static void bubbleSort(int[] arr){
        // boolean swapped;   // check if array in sorted or not
            // run the steps n-1 times
        for(int i=0; i<arr.length-1; i++){
            // swapped = false;
            // for each swap max value will come to the last respective index
            for(int j=1; j<arr.length-i; j++){ // (arr.length-i)Apply this logic to sort half of an array
                // swap if the item is smalller than the previous one
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    // swapped = true;   //if check array in sorted
                }
            }
            // if no swap is occuring then break the loop
            // if(!swapped){
            //     break;
            // }
        }
    }
}
