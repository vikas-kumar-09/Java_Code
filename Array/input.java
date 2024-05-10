package Array;

import java.util.Arrays;
import java.util.Scanner;

// import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 238;
        arr[3] = 27;
        arr[4] = 233;

        System.out.println(arr[3]);

        // Way to take input in array  using for loop
        for(int i=0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }

        // There are Three way to print an array
        // 1. first way(Best one)
        System.out.println(Arrays.toString(arr));

        // //  2. second way
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // I can replace the second way of printing only using 
        // (System.out.println(Arrays.toString(arr)))

        // // 3. third way(using for each loop) (Enhance for loop)
        // for(int num : arr){  // for eevry element in the array print the array
        //     System.out.println(num); // here nums represent the element of the array
        // In this array what is the type of data of every element(it is integer)
        // } 
        in.close();

        // Array of objects
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Vikas";
        System.out.println(Arrays.toString(str));

        
    }
    
}
