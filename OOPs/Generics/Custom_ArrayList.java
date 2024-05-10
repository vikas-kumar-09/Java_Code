package OOPs.Generics;

import java.util.ArrayList;

public class Custom_ArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Custom_ArrayList() {
        this.data = new int [DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize;
        }
        data[size++] = num;
    }

   private boolean isFull() {
       return size = data.length;
    }

public static void main(String[] args) {
    ArrayList list = new ArrayList<>();

   
   } 
}
