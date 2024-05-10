package Searching1.bsQuestion;

// Find Peak Index in the montain array(leetcode medium)
// or find the peak element
public class MountainArray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 6, 4, 3, 2, 1};
        
          System.out.println(arr);
    }
    static int peakIndexInMountainArray(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end -start) / 2;

            if(arr[mid] > arr[mid+1]){
                // you are in  dec. part of array
                // this might be the possible ans, but look at the left hand side
                // that is why end!=mid-1; 
                end = mid;
            }
            else{
                // you are ins. part of an array
                start = mid + 1;
            }  
        } 
        // in the end start == end and pointing to the largest elements in the array becoz of two above checks
        // starts and end are always trying to find the max elements bcoz of above two checks
        // hence they are pointing to just one elements, that is the max one bcoz thats is whats checks say

        return end; // you can return end as well bcoz both are =
    }
}
