package DSACompanyWise_Parik_Jain;

// Find the length of largest subarray with 0 sum
public class Largest_Subarray_With_0_Sum {

    public static void main(String[] args) {
        
        int [] arr =  {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        int ans = withZeroSum(arr, n);

        System.out.println(ans);
    }
    static int withZeroSum(int [] arr, int n){
        
        // to find the max. largest subarray length = max_length
        int max_length = 0;
        
        // To iterate through entire array
        for(int i=0; i<n; i++){

            int curr_sum = 0;

            for(int j=i; j<n; j++){
                curr_sum = curr_sum + arr[j];

                if(curr_sum == 0){
                    max_length = Math.max(max_length, j - i + 1);
                }
            }
        }

        return max_length;
    }
}