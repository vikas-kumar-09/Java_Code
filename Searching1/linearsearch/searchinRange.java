package Searching1.linearsearch;

public class searchinRange {
    public static void main(String[] args) {
        int[] arr = {12, 18, -7, 3, 14, 28};
        int target = -79;
        System.out.println(linearSearch(arr, target, 1, 4));
        
    }
    static int linearSearch(int [] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }
        // using for loop
        for(int index =start; index<=end; index++){
            int element = arr[index];

            if(element == target){
                return index;
            }

        }
        return -1; // -1 will never be the index
    }
}

