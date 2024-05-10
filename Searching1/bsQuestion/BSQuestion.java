package Searching1.bsQuestion;

public class BSQuestion {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        // int ans = floor(arr, target);
        int ans = ceiling(arr, target);
        System.out.println(ans);
        
    }
    // celing number : smaller no. greater than or >= target
    static int ceiling(int[] arr, int target){
         // what if the target number is the greatest in the array

        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid +1;
            }
            else if( target < arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    // floor number : greater number smaller than or <= target
    static int floor(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid +1;
            }
            else if( target < arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
