package Searching1.linearsearch;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {12, 18, -7, 3, 14, 28, 99};
        System.out.println(max(arr));
    }
    // assume array is not empty
    // return the minimum element in array
    static int min(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
            min = arr[i];
        }
        }
       
        return min;
    }
    // assume arr.length !=0
    // return maximum element in array
    static int max(int[] arr){

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
            max = arr[i];
        }
        }
       
        return max;
    }
}
