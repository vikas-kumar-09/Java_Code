package CodingPlatform.GFG;

// Count pairs with given sum (https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions)
public class CountPairSum {
    public static void main(String[] args) {
       int[] arr = {1, 5, 7, 1};
       int num = arr.length;
       int k = 6;
       countPairSum(arr, num, k);
        
    }
    static int countPairSum(int [] arr, int num, int k){
        
        int count = 0;
        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){

                if(k - arr[i] == arr[j]){
                     count++;
                }
            }
        }
        return count;
    }
    
}
