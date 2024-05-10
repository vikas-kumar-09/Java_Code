package Recursion.Recursion_L1_Question;

public class BS {    // bs = Binary Search
    public static void main(String[] args) {
        int[] arr = {0, 11, 23, 34, 21, 44, 1};
        int target = 12;
        System.out.println(search(arr, target, 0, arr.length-1));
        
    }
    static int search(int[] arr, int target, int start, int end){

        if( start > end){
            return -1;
        }

        int mid = start + (end -start) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return search(arr, target, start, mid-1);
        }
        else{
            return search(arr, target, mid+1, end);
        }
    }
}
