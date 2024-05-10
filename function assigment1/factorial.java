
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int num = in.nextInt();
        // System.out.println(factorial1(4));
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num1 = in.nextInt();
        System.out.println(factorial1(num1));
        in.close();
    }
    static int factorial1(int num){

        if(num == 0){
            return 1;
        }
        else{
            return num * factorial1(num -1);
        }
    }
    
}
