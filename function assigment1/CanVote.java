// package function assignment;
import java.util.Scanner;
public class CanVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int num = in.nextInt();
        // System.out.println(vote(num));
        in.close();
        
    }
    static void  vote(int age){
        if(age == 18 && age >= 18){
            System.out.println("eligible for vote");
        }
        
        if(age < 18){
            System.out.println("not eligible for vote");
        }
        
    }
}
