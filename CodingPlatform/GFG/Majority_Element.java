package CodingPlatform.GFG;

// import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Searching&difficulty=Medium&sortBy=submissions
public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 4, 6, 6, 7};
        int size = 7;
        System.out.println(majorityElement(arr, size));      
    }
    static int majorityElement(int arr[], int size)
    {
        // your code here
    //    Arrays.sort(arr);

       int maxCount = 0;
       int index  = -1;
       for(int i=0; i<size; i++){
        int count = 0;
        for(int j=i; j<size; j++){

            if(arr[i] == arr[j]){
                count ++;
            }

            if(count > maxCount){
                maxCount = count;
                 index = i;
            }
            if(maxCount > size/2){
                return arr[index];
            }
        }
       }
       return -1;
}
}