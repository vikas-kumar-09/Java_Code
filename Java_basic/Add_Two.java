
// add two number without using " + " Operator
// we can use increment and decrement operator to add 2 number
public class Add_Two {
    public static void main(String[] args) {
        int x = 10;
        int y = 14;
        System.out.println("The sum is : " + add(x, y));
        
    }
//   steps :
    // 1. increment x and decrement y
    // 2. repeat step 1 untill y become zero
    static int add(int a, int b){

        while ( b !=0){
            a++;
            b--;
        }
        return a;
        // for(int i=1; i<=b; i++){
        //     a++;
        //     return a;
        // }
    }
}
