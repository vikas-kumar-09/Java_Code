package DSACompanyWise_Parik_Jain;

/**
 * Matrix_Is_Symmetric
 */
// https://parikh.club/parikh_multidarrays2
public class Matrix_Is_Symmetric {

    public static void main(String[] args) {
        int[][] matrix = {
             {1, 2, 3, },
             {2, 4, 5, },
             {3, 5, 8, },

        };
        
    }

    static boolean matrix_Is_Symmetric(int[][] matrix){

        int row = matrix.length;

        for(int i=0; i<row; i++){
             for(int j=i+1; j<row; j++){

                if(matrix[i][j]!=matrix[j][i]){
                    return false;
                }
             }
        }
        return true;
    }
}