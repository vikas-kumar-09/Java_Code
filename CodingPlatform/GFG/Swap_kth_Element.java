package CodingPlatform.GFG;

import java.util.Arrays;

// Swap kth elements
// https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions
public class Swap_kth_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(swap(arr, 2, 5)));
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){   // conditional voilation
            // swap
            swap(arr, 2, 4);   
            start ++;
            end--;
        }
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;    
    }
}
