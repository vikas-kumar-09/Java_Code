package Searching1.bsQuestion;

// Q. Find the position of element in the sorted  infinite array(Leetcode problem)
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 15, 25, 30};
        int target = 3;
        int ans1 = ans(arr, target);
        System.out.println(ans1);
        
    }
    static int ans(int[] arr, int target){

        // find the range
        // starts with the box of size 2

        int start = 0;
        int end = 1;
       // condition for to find value in the range
        while(target > arr[end]){
            int temp = end +1; // here temp = newstart

            // double the box value
            // end = previous end + SizeOfbox *2;

            end = end + (end -start + 1) * 2;
            start = temp;

        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){

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
