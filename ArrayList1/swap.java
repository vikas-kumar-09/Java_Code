// package ArrayList1;

import java.util.Arrays;
// two pointer method
// Reverse the array in groups 
public class swap {
    public static void main(String[] args) {

        int[] arr = {90, 80, 70, 60, 50};
        System.out.println(Arrays.toString(arr));
        //swap1(arr, 0, 1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        // System.out.println((arr));
        
    }
    // Reverse the array
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){   // conditional voilation
            // swap
            swap1(arr, start, end);   
            start ++;
            end--;
        }
    }
    static void swap1(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
