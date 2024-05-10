
 package NumberSystem;
    public class FindOdd {
    public static void main(String[] args) {
        int n  = 10;
        System.out.println(findOdd(n));
        
    }
    static boolean findOdd(int n){

        return (n & 1) == 1;
    }
}

 