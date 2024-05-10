package CodingPlatform.GFG;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3};
        System.out.println("Missing Number: " + missingNumber(arr1)); // Output: 2

        // int[] arr2 = {2, 5, 3, 1};
        // System.out.println("Missing Number: " + missing_Number(arr2, arr2.length)); // Output: 4
    }
    static int missingNumber(int[] nums) {
        
        int n = nums.length;
        // int x = Math.abs(n);
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return actualSum - expectedSum;
    }

    // Alternative Approach

    // static int missing_Number(int[] arr, int n){
    
    // //    int n = 0;
    // int expected = (n * (n+1)) / 2;
    // // n = size of an array
    // int Tsum = 0;
    // for(int i=0; i<n; i++){
    //     Tsum = Tsum + arr[i];
    // }
    // return expected-Tsum ;
}
















 