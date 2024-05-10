package CodingPlatform.GFG;

// Find the element that appears once in sorted array
// https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1?page=1&category=Searching&difficulty=Easy&sortBy=submissions
public class FindOnce {
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 3, 3, 9, 5, 5,};
        System.out.println(findOnce(arr));
        
    }
    static int findOnce(int[] arr){

        for(int i=0; i<arr.length; i=i+2){

            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }

        return -1;
    }
}
