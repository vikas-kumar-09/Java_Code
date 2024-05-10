package Array;

import java.util.Arrays;

public class passingfunction {
    public static void main(String[] args) {
        int [] arr = {12, 1, 34, 5, 7, 9};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void change(int[] num){
        num[0] = 99;
    }
    
}
