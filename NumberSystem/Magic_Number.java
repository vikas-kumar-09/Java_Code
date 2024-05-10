package NumberSystem;

public class Magic_Number {
    public static void main(String[] args) {
        int num = 1;
        
        int ans = 0;
        int base = 5;

        while ( num > 0) {
            int last = num & 1;
            num = num >> 1;

            ans += last * base;
            base = base * 5;

        }
        System.out.println(ans);
        
    }

}
