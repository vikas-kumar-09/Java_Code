package Searching1.BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {-22, 12, -10, 0, 2, 3, 4, 15, 16, 18, 22, 34, 65};
        int target = -10;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index of the element
    // return -1 if it does not exit
    static int BinarySearch(int[] arr, int target){
      
        int start =0;
        int end = arr.length-1;

         while(start <= end){
            // find the middle elements
            int mid = start + (end -start) / 2;   // it might be possible that (start + end), 
                                                   // will exceed the range of int in java
         if(target > arr[mid]){
            start = mid + 1;
         }
         else if(target < arr[mid]){
            end = mid -1;
         }
         else{
            // ans found
            return mid;
         }

         }
       return -1;
    }
}
