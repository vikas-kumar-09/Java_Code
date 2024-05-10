package Collection_Framework_Durgesh;

import java.util.*;

public class StartCode {
    public static void main(String[] args) {
        
        System.out.println("Hello welcome to collection framework");

        /*
         1) tyep safe : same datatype element

         2) type safe : different datatype element
         */

         // type  safe colection
         ArrayList<String> names = new ArrayList<>();
         names.add("vikas");
         names.add("sitara");
         names.add("akash");
         names.add("John");

         System.out.println(names);

         // un-type safe
         LinkedList list = new LinkedList<>();
         list.add("vikas");
         list.add(345);
         list.add(567.789);

         System.out.println(list);
    }
}
