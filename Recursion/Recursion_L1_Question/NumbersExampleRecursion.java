package Recursion.Recursion_L1_Question;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
     // write a function takes in a number and prints it.
        // prints first 5 numbers : 1 2 3 4 5
         print(1);
    }
    static void print(int n){
        if(n == 5){                     //  base condition : where are recursion will stop making new calls                             
        System.out.println(n);
            return;
        }
        System.out.println(n);
        // recursive call 
        // if a function is call again and again , you can treat it as an sepereate call in stack
        // this is known as tail recursion 
        // this is called last function call 
        print(n + 1);
    }
}

