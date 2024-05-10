// package ArrayList1;
import java.util.ArrayList;
import java.util.Scanner;

// import Array.input;
public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(78);
        // list.add(98);
        // list.add(998);
        // list.add(745);
        // list.add(712);
        // list.add(743);

        // // System.out.println(list.contains(71322));
        // System.out.println(list);
        // list.set(0, 99);
        // System.out.println(list);

        // input 
        for(int i=0; i<5; i++){
            list.add(input.nextInt());
        }
        // output // get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
    
}
