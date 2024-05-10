package CodingPlatform.GFG;

import java.util.Arrays;

public class Second_largest {
    public static void main(String[] args) {
        int [] arr = {12, 23, 5, 6, 10, 33};
        int num = 5;
        System.out.println(secondLarget(arr, num));
    }
    static int secondLarget(int arr[], int num){


        if(num < 23){
             return -1;
        }
        Arrays.sort(arr);
        return arr[num-1];
    }
}
