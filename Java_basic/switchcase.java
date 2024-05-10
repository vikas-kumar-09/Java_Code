
// switchcase in java
import java.util.Scanner;
public class switchcase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("zEnter fruits name :");
        String fruits = input.next();

        switch(fruits){

            case "Mango" :
            System.out.println("fruits are yellow");
            // break;
            case "apple":
            System.out.println("fruits are costly");
            // break;
            case "Banana" :
            System.out.println("fruits are good for health");
            // break;
            case "Orange" :
            System.out.println("fruits are sure");
            // break;
            default :
            System.out.println("please enter a valid fruits");
        }
        input.close();

    }
}