package DSACompanyWise_Parik_Jain;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class Pair_Sum {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3};
        int target = 4;

        int size = arr.length;

        System.out.println(pairSum(arr, size, target));
        
    }

    static int pairSum(int [] arr, int n, int target){
        
        Arrays.sort(arr);
        // if(arr.length == 0){
        //     return 0;
        // }
        int count = 0;
        for(int i=0; i<n; i++){
            
            for(int j=i+1; j<n; j++){

                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }
}
