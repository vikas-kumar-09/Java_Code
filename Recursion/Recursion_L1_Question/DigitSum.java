package Recursion.Recursion_L1_Question;

public class DigitSum {
    public static void main(String[] args) {
        int ans = product(23);
        System.out.println(ans);
        
    }
    // sum of a digits
    static int sum(int n){

        if( n == 0){
            return 0;
        }
        return (n % 10) + sum(n/10);
    }
    // product of a digit
    static int product(int n){

        if( n == 0){
            return 0;
        }
        return (n % 10) * sum(n/10);
    }
}
