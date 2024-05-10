package CodingPlatform.GFG;

// print the all subarrays of a given array
public class SubArray_of_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printSubArray(arr);   
    }

    static void printSubArray(int [] arr){
         // for outer loop
        for(int i=0; i<arr.length; i++){

            // another loop inside i loop
            for(int j=i; j<arr.length; j++){
              
                // there are another loop for printing subarray
                for(int k=i; k<j; k++){

                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
