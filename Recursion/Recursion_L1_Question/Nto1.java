package Recursion.Recursion_L1_Question;

public class Nto1 {
   public static void main(String[] args) {
    // fun(0);
    // funboth(5);
    funrev(5);
   } 
   // printing from 5 to 1
   static void fun(int n){
    // edge cases
          if(n == 0){
            return;
          }
          System.out.println(n);
          fun(n -1);
   }

  //  printing from 1 to 5
   static void funrev(int n){
          if(n == 0){
            return;
          }
          funrev(n-1);
          System.out.print(n);
          // funrev(n-1);


   }
  //  static void funboth(int n){
  //         if(n == 0){
  //           return;
  //         }
  //         System.out.println(n);
  //         funrev(n-1);
  //         System.out.println(n);

  //  }
}
