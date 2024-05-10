
package NumberSystem;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2};
        // Every number is appearing twice but only one number is appearing  once
        // Please find that one number in array
        System.out.println(ans(arr));;
    }
    static int ans (int[] arr){
        int unique = 0;
        for(int n : arr){

            unique ^= n;
        }
      return unique;
    }
}