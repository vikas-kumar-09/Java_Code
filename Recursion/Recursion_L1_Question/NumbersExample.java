package Recursion.Recursion_L1_Question;

public class NumbersExample {
    public static void main(String[] args) {
        // write a function takes in a number and prints it.
        // prints first 5 numbers : 1 2 3 4 5
         print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    // function body here changes
    static void print5(int n){
        System.out.println(n);
    }
}
