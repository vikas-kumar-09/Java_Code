package Sliding_Window_Technique;

public class Max_Sum_SubArray_Size_k {
    public static void main(String[] args) {
        int[] arr = {2, 9, 31, -4, 21, 7};
        int k = 3;
        // System.out.println(max_Sum_SubArray_Size_k2(arr, k));
    }
}
        
    // }
    // Naive Approach

//     static int max_Sum_SubArray_Size_k2(int [] arr, int k){
//        int cSum = 0;   // cSum = currentSum
//        int mSum = 0;   // mSum = maximum Sum

//        for(int i=0; i<arr.length; i++){
           
//         for(int j=i; j<arr.length-k; j++){

//             cSum = cSum + arr[i];
//             mSum = Math.max(cSum, mSum);
//         }
//         return mSum;
//        }
//     }
// }
    // }
// }
    // }

    // Optimize alogorithm

    // static int max_Sum_SubArray_Size_k(int[] arr, int k){
    //     int wSum = 0;
    //     int mSum = Integer.MIN_VALUE;

    //     for(int i=0; i<k; i++){
    //         wSum = wSum + arr[i];
    //     }
    //     for(int i=k; i<arr.length; i++){
    //         wSum = wSum + arr[i - k] + arr[i];
    //         mSum = Math.max(mSum, wSum);
    //     }
    //     return mSum;
    // }
// }
