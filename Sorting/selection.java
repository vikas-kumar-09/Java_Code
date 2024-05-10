package Sorting;

import java.util.Arrays;

// import Array.input;
// selecting the max. elements and put it into its correct position 
// """"""""""""" min. """""""""""''''''"""""""""""""""""""""""""""''
public class selection {
    public static void main(String[] args) {
        int [] arr = {1,4, 6, 99, 2};
        selection1(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    // Insertion sort in java
//     static void insertion(int [] arr){
//   // find max. item in the remaining array and swap with its correct index
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=i+1; j>0; j--){

//                 if(arr[j] < arr[j-1]){
//                     swap(arr, j, j-1);   // j is less then j-1 just break the loop(arr[j] < arr[j-1])
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//     }

    // Selection in java
    static void selection1(int [] arr){
        for(int i=0; i<arr.length-1; i++){
           int last = arr.length - i -1;
           int maxIndex = getMaxIndex(arr, 0, last);
           swap(arr, maxIndex, last);

        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
           int max = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
