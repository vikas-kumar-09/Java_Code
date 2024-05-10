package OOPs.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // list2.add(33);
        // list2.add(43);
        // list2.add(73);

        // System.out.println(list2);

        List<Integer> vector = new Vector<>();

        vector.add(22);
        vector.add(25);
        vector.add(27);
        vector.add(29);
        
        System.out.println(vector);


    }
}
