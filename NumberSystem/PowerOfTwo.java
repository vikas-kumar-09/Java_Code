package NumberSystem;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 32;  // note : fix for n == 0;

        boolean ans = (num & (num-1)) == 0;
        System.out.println(ans);
        
    }

}
