
package Searching1.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
      // int [] arr = {-22, 12, -10, 0, 2, 3, 4, 15, 16, 18, 22, 34, 65};
      int[] arr = {99, 80, 78, 55, 43, 33, 22, 14, 12, -25, -34};

      int target = -25;
      int ans = orderagnosticBS(arr, target);
      System.out.println(ans);
    }
    static int orderagnosticBS(int[] arr, int target){
      
        int start =0;
        int end = arr.length-1;

        // find whether the array is sorted in ascending or decending order

      //   boolean isAsc = arr[start] < arr[end];
        boolean isAsc;
        if(arr[start] < arr[end]){
         isAsc = true;
        }
        else{
         isAsc = false;
        }

        // find the middle element
       // it might be possible that (start + end), will exceed the range of int in java
         while(start <= end){
            int mid = start + (end -start) / 2;

            if(arr[mid] == target){
               return mid;
            }
         // for ascending order array
            if(isAsc){
              if(target > arr[mid]){
            start = mid + 1;
         } 
         else {         //if(target < arr[mid])
            end = mid -1;
         }
            }
            // for decending order array
            else{
                if(target < arr[mid]){
            start = mid + 1;
         }
         else {        //if(target > arr[mid])
            end = mid -1;
         }
       }
    }
       return -1;
    }
}
