package NumberSystem;

// find the numbers of digits in base b.
public class NoofDigits {
    public static void main(String[] args) {
        int num = 45678;

        int base = 10;

        int ans = (int)(Math.log(num) / Math.log(base)) + 1;

        System.out.println(ans);
        
    }
}
