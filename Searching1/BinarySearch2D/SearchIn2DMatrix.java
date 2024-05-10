package Searching1.BinarySearch2D;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10},
            {15,35},
            {28, 37, 49},
            {33, 34, 38, 50},
        };
        System.out.println(search(matrix, 37));
        
    }
    static int search(int[][] arr, int target){

        int ans  = -1;

        for(int row=0; row<arr.length; row++){
              for(int col=0; col<arr[row].length; col++){

                if(arr[row][col] == target){
                   return arr[row][col];
                }
              }
        }
        return ans;
    }
}
