
// import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("enter number 1 :");
        // int n1 = in.nextInt();
        // System.out.print("enter number 2");
        // int n2 = in.nextInt();
        // System.out.print("enter number 3");
        // int n3 = in.nextInt();
        // int ans = min(n1, n2, n3);
        // System.out.println(ans);
        // in.close();
       int ans = min(10, 20, 30);
       System.out.println(ans);
        
    }
    static int min(int a, int b, int c){
        int min1 = a;
        if(b < min1){
            min1 = b;
        }
        if(c < min1){
            min1 = c;
        }
        return min1;
    }
    static int max(int a, int b, int c){
        int max1 = a;
        if(b > max1){
            max1 = b;
        }
        if(c > max1){
            max1 = c;
        }
        return max1;
    }
    
}
