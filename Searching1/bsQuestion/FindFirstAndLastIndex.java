package Searching1.bsQuestion;

public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(searchRange(arr, target));
        
    }
    static int[] searchRange(int[] nums, int target){

        int[] ans = {-1, -1};
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
      //   if(ans[0] != -1){
      //   ans[1]= Search(arr, target, false);
      //   }
      ans[0] = start;
      ans[1] = end;
      return ans;
    }
    // this function is just to return the  index value of target
     static int Search(int [] nums, int target, boolean FindStartIndex){
        int ans = -1;  
        int start = 0;
        int end = nums.length-1;

        // find the middle element
       // it might be possible that (start + end), will exceed the range of int in java
         while(start <= end){
            int mid = start + (end -start) / 2;

         if(target > nums[mid]){
            start = mid + 1;
         }
         else if(target < nums[mid]){
            end = mid -1;
         }
         else{
            // potential ans found(might be possible ans found)
            ans = mid;
         
         if(FindStartIndex){
            end = mid -1;
         }
         else{
            start = mid +1;
         }

         }
      //  return ans;
    }
         return ans;
}
}
