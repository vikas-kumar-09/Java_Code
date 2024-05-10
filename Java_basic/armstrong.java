
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
    //  boolean ans = Isarmstrong(num);
    //  System.out.println("Enter a number : ");
     System.out.println(Isarmstrong(num));
    //  in.close();
    
    // for(int i=0; i<1000; i++){
    //     if(Isarmstrong(i)){
    //         System.out.print(i +" ");
    //     }
    // }  
    in.close();      
    }
    static boolean Isarmstrong(int num){
        int original = num;
        int sum = 0;

        while( num > 0){
            int rem = num % 10;
            sum = sum + rem*rem*rem;
            num = num / 10;
        }
        return sum == original;
    }
    
}
