
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = Palindrome(num);
        System.out.println(ans);
        input.close();
        
    }
    static int Palindrome(int num){
        int temp = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if( temp == sum){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
