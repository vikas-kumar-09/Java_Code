
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = in.nextInt();
        System.out.println(Iseven(num));
        in.close();
        
    }
    static boolean Iseven(int num){
        return num % 2 == 0;
    }
    
}
