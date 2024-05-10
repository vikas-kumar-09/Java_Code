package Strings;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3)); // convert to char
        System.out.println("vikas" + new ArrayList<>());
        System.out.println("vikas" + new Integer(66));
        
        String ans = new Integer(44) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}
