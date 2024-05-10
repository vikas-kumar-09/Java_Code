
// VaraArgs method in java

import java.util.Arrays;
public class VarArgs{
    public static void main(String[] args){
    //  fun();
    fun1(2, 5, "vikas", "ksh", "total");

    }
    static void fun1(int a, int b, String ...s){
        // System.out.println(a, b, );

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}