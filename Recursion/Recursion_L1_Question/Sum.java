package Recursion.Recursion_L1_Question;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(2);
        System.out.println(ans);
        
    }
    static int sum(int n){

        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    
}
