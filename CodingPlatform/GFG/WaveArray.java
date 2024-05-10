package CodingPlatform.GFG;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        
    }
     static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<n-1;i+=2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        return;
    }
}
