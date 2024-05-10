package CodingPlatform.GFG;

import java.util.ArrayList;

public class FirstNLastIndex {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 4};
        System.out.println(firstAndlast(arr, arr.length-1, 1));
    }
    static ArrayList<Integer> firstAndlast(int nums[], int n, int x){

        ArrayList<Integer> ans = new ArrayList<>();
        if(findIndex(nums, x, true) == -1){
            ans.add(-1);
            return ans;
        }
        int start = findIndex(nums, x, true);
        int end = findIndex(nums, start, false);
        ans.add(start);
        ans.add(end);
        return ans;
    }
    static int findIndex(int arr[], int target, boolean FindStartIndex){

        int start = 0;
        int end = arr.length -1;
        int ansnotfound = 1;

        while (start<= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                target = mid;
            }
            if(FindStartIndex){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ansnotfound;
    }
}
