package Searching1.bsQuestion;

// search the element in the mountain peak array
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 4, 5, 3, 1};
        int target = 289;
        int ans = search(arr, target);
        System.out.println(ans);
        
    }
    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderagnosticBS(arr, target, 0, 4);
        if(firsttry != -1){
            return firsttry;
        }
        return orderagnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end -start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }  
        } 
        return start; // you can return end as well bcoz both are =
    }

    static int orderagnosticBS(int[] arr, int target, int start, int end){
      
        // int start =0;
        // int end = arr.length-1;

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
   // }
// }
   

    static int BinarySearch(int[] arr, int target){
      
        int start =0;
        int end = arr.length-1;

        // find the middle element
       // it might be possible that (start + end), will exceed the range of int in java
         while(start <= end){
            int mid = start + (end -start) / 2;

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
   