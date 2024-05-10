package kadane_Algo;

// maximum sub_array sum in a given array using :  kadene's algorithm
public class Kadene_Algorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -5, -8, -3};
        System.out.println(maxSubarraySum2(arr));
        
    }
    // Naive Approch : TC O(n^2)
    // static int maxSubarraySum(int arr[]){
    //      int sum = arr[0];
    //      int maxSum = arr[0];
         
    //      for(int i=0; i<arr.length; i++){

    //         for(int j=i; j<arr.length; j++){

    //             sum = sum + arr[j];
    //             maxSum = Math.max(sum, maxSum);
    //         }
    //      }
    //      return maxSum;
    // }
    
    // optimize Approach : TC O(n)
    static int maxSubarraySum2(int arr[]){
        int sum = arr[0];
        int maxSum = arr[0];

        for(int i=0; i<arr.length; i++){

            if(sum >=0){
                sum = sum + arr[i];
            }
            else{
                sum = arr[i];
            }
            // (sum >=0) = sum = sum + arr[i] ? sum = arr[i];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }    
}
