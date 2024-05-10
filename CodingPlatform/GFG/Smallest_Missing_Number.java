package CodingPlatform.GFG;

import java.util.Arrays;

public class Smallest_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = 5;
        System.out.println(smallestMissingNumber(arr, size));
        
    }
    static int smallestMissingNumber(int [] arr, int size){

        Arrays.sort(arr);
        int missingNumber = 1;
        for(int i=0; i<size; i++){

            if(arr[i] == missingNumber){
                missingNumber++;
            }
        }
        return missingNumber;
    }
}
