package Recursion.Recursion_L1_Question;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(4);   // it is not giving ans because recursion tree re-evaluation the same value
                              // again and again
     System.out.println(ans);
    }
    static int  fibo(int n){
        // base conditions
        if( n < 2){
            return n;
        }
        return fibo(n-1) + fibo (n-2);
    }
}
