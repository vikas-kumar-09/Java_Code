
// import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int num = in.nextInt();
        // boolean ans = IsPrime(num);
        // System.out.println(ans);
        // in.close();
        
        int n = 20;
        for(int i=1; i<n; i++){
            System.out.println(i+" "+IsPrime(i));
        }
    }
    static boolean IsPrime(int num){
        if (num <=1) {
            return false;     
        }
        int c = 2;
        while( c * c < num){  // taking square root of both the sides
            if( num % c == 0){
                return false;
            }
            c++;
        }
        return true;
        // c * c > num;
    }
    
}
