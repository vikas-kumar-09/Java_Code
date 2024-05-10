package Searching1.BinarySearch2D;

import java.util.Arrays;
public class RowColWiseMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 35},
            {28, 29, 37, 49},
            {33, 34, 38, 50},
        };
        System.out.println(Arrays.toString(search(matrix, 388)));
        
    }
    // Only applicable when you have given a sorted 2D atrix
    static int[] search(int[][] matrix, int target){

        int row = 0;
        int col = matrix.length -1;

        while(row <matrix.length && col >=0 ){

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if(matrix[row][col] < target){
              row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
