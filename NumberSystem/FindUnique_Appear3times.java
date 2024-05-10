package NumberSystem;

// In a given array every number is appearing
//  3 times only 1 number is appering once please find that number
public class FindUnique_Appear3times {
    public static void main(String[] args) {
        int [] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(findUnique(arr));
        
    }
    static int findUnique(int [] arr){
        int unique = 0;

        for(int n : arr){

            unique = unique + n % 3;
        }
        return unique;
    }
}
