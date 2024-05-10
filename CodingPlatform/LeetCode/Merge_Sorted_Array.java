package CodingPlatform.LeetCode;

// Link : https://leetcode.com/problems/merge-sorted-array/description/

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int[] num2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        mergeSort(nums1, m, num2, n);
        for(int i=0; i<m+n; i++){
            System.out.print(nums1[i] + " ");
        }
        
    }

    public static void mergeSort(int[] nums1, int m, int[] num2, int n){
         int i = m-1;
         int j = n-1;
         int k = m+n-1;

        while (i >= 0 && j>=0){

            if(nums1[i] > num2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }

            else{
                nums1[k] = num2[j];
                k--;
                j--;
            }
        }
    }
}
