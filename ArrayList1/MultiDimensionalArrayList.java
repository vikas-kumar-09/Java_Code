// package ArrayList1;

import java.util.ArrayList;
import java.util.Scanner;

// import Array.input;
// import java.util.Scanner;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initiliazation three list added
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
        // add element
        for(int i = 0; i<3; i++){
            for(int j =0; j<3; j++){
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);
        input.close();
    }
    
}
