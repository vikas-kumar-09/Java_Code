package Patterns;

public class Patterns {
    public static void main(String[] args) {
        // pattern2(4);
        // pattern1(4);
        pattern30(5);
    }
    static void pattern30(int n){
        for(int row=1; row <= n; row++){

            for(int space=0; space < n-row; space++){
                System.err.print( "  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.err.print(col+ " ");
            }
            System.err.println();
        }
    }
     // try to print the pattern 28
    static void pattern28(int n){

        for(int row=0; row< 2 * n; row++){
            // for every row, run the column
            int totalscolInRow = row > n ? 2 * n -row: row;

            int noOfSpaces = n - totalscolInRow;
            for(int s=0; s<noOfSpaces; s++){   // for reverse print logic - col<=n-row+1
                System.out.print(" ");
            }
            for(int col=0; col<totalscolInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     // try to print the pattern 5
    static void pattern5(int n){

        for(int row=1; row< 2*n; row++){
            // for every row, run the column
            int totalscolInRow = row > n ? 2 *n -row: row;
            for(int col=1; col<totalscolInRow; col++){   // for reverse print logic - col<=n-row+1
                System.out.print("*");
            }
            System.out.println();
        }
    }
     // try to print the pattern 4
    static void pattern4(int n){

        for(int row=1; row<=n; row++){
            // for every row , run the column
            for(int col=1; col<=row; col++){   // for reverse print logic - col<=n-row+1
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
     // try to print the pattern 3
    static void pattern3(int n){

        for(int row=1; row<=n; row++){
            // for every row , run the column
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     // try to print the pattern 2
    static void pattern2(int n){

        for(int row=1; row<=n; row++){
            // for every row , run the column
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // pattern number 1
    static void pattern1(int n){

        for(int row=1; row<=n; row++){
            // for every row , run the column
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            // when one row is printed, we nedd to add newline
            System.out.println();
        }
    }
   
}
