package Searching1.bsQuestion;

// import BinarySearch.binarySearch;
// program is not completed and  this topic as well
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 6));
    }
    static int search(int [] nums, int target){
        int pivot = findpivot(nums);

        // if you did not find pivot it means array is not roatated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if pivt is found ... you have 2 asc.ascending sorted  array
        if (nums[pivot] == target) {
            return pivot;
        }
        return 1;
    }
    static int binarySearch(int[] arr, int target, int start , int end){
      
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
    static int findpivot(int[] arr){
       
        int start = 0;
        int end = arr.length -1;

        while (start <=end) {
            int mid = start + (end -start) / 2; 
            // 4 cases over here

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1])
                return mid-1;
            
            if(arr[mid] <= arr[start]){
                 end = mid -1;
            }
            else{
                 start = mid +1;
            }

        }
        return -1;
    }
}