// package ArrayList1;

public class maxElement {
    public static void main(String[] args) {
        int [] arr = {12, 3, 44, 68, 8};
        System.out.println(maxRange(arr, 1, 4));
        
    }

     // imagine array in not empty
    // if array is empty then = (maxVal = Integer.MIN_VALUE)
    // work on the edge case here

     static int maxRange(int[] arr, int start, int end){

        if(end > start){   // edge cases
            return -1;
        }
        if(arr == null){    // edge cases
            return 0;
        }
        int maxVal = Integer.MIN_VALUE;
        for(int i=start; i<=end; i++){
            
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
    // find max item in array
    static int max(int[] arr){
        if( arr.length == 0){
            return -1;
        }
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
}
