// method overloading in java

public class Overloading {
    public static void main(String[] args){
        fun(90);
        fun("vikas");

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    
}
