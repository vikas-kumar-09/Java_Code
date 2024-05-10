package CodingPlatform.GFG;

import java.util.ArrayList;
import java.util.Arrays;

// Subarray with given sum
// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions

public class Subarray_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n1 = arr.length;
        int sum = 15;
        System.out.println(subarraySum(arr, n1, sum));
        
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        Arrays.sort(arr);
        int start = 0;
        int currSum = 0;

        ArrayList<Integer> index = new ArrayList<>();
        
        for(int end=0; end<n; end++){
            currSum = currSum + arr[end];

            while (currSum > sum && sum!=0) {
                currSum = currSum - arr[start];
                start++;
            }

            if(currSum == sum){
                index.add(start + 1);
                index.add(end + 1);
                return index;
            }
        }
        index.add(-1);
        return index;   
    } 
}


