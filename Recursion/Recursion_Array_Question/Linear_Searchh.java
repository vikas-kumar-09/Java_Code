package Recursion.Recursion_Array_Question;

import java.util.ArrayList;

// To find the all possible index of target element
public class Linear_Searchh {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 21, 4, 9, 4};
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        // System.out.println(arr);
        // System.out.println(findAllIndexReturn(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndexRetunrn2(arr, 4, 0));
        
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){

        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index);
    }

    // return an ArrayList
    static ArrayList<Integer> findAllIndexReturn(int[] arr, int target, int index, ArrayList<Integer> list){
         
        if(arr[index] == target){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexReturn(arr, 4, index+1, list);
    }

    // return list without passing argument inside function

    static ArrayList<Integer> findAllIndexRetunrn2(int[] arr, int target, int index){

          ArrayList<Integer> list = new ArrayList<>();

          if(arr[index] == target){
            return list;
          }
          if(arr[index] == target){
            list.add(index);
          }
          ArrayList<Integer> ansFromBelowCall = findAllIndexRetunrn2(arr, target, index+1);
          list.addAll(ansFromBelowCall);
          return list;
    }
    // return list;

    
}
