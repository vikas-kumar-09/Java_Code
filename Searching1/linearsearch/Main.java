package Searching1.linearsearch;

// import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        
        int[] nums = {12, 3, 5, 22, 17, -11, 14, 35};
        int target = 12;
        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);
        
    }
    
    // search the target element and return true or false
     static boolean linearSearch3(int [] arr, int target){

        if(arr.length == 0){
            return false;
        }
        // using for loop
        // for(int index =0; index<arr.length; index++){
        //     int element = arr[index];

        // using for each loop
        for(int element : arr){
            if(element == target){
                return true;
            }

        }
        return false;
    }

    // search the target element and return the elements
    // if elements is not found return -1;
    static int linearSearch2(int [] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        // using for loop
        // for(int index =0; index<arr.length; index++){
        //     int element = arr[index];
        for(int element : arr){
            if(element == target){
                return element;
            }

        }
        return -1;  // -1 might be the one of  elements so return => (Integer.MAX_VALUE)
    }

    // search the element in array if item is found return index
    // otherwise if not found return -1
    static int linearSearch(int [] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        // using for loop
        for(int index =0; index<arr.length; index++){
            int element = arr[index];

            if(element == target){
                return index;
            }

        }
        return -1; // -1 will never be the index
    }
}
