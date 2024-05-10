package CodingPlatform.GFG;

public class Largest_SubArray_WithZeroSum {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        int num = 8;
        largest_SubArray_WithZeroSum(arr, num);
    }
    static int largest_SubArray_WithZeroSum (int [] arr, int n){
          
        int max1 = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            int count = 0;
            for(int j=i; j<n; j++){
                sum = sum + arr[i];

                if(sum == 0){

                    max1 = Math.max(max1,count);

                }
            }
        }
        return max1;
    }
    
}
