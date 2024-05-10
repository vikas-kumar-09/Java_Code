
// public class Swap {
//     public static void main(String[] args){
//       // System.out.println(swap(10, 20));
//       int x = 10;
//       int y = 20;
//      swap(x, y);

//     }
//     static void swap(int a, int b){
//         int temp = a;
//          a = b;
//          b = temp;
//     }
// }

// wihout using third variable and operator
class S {
  public static void main (String[] args) {
        int a = 10;
        int b = 20;

      System.out.println("Before swapping, a : " + a + " and  b : " + b);

      // Swapping a and b using XOR
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;

      System.out.println("After swapping, a : " + a + " and b : " + b);
  }
}