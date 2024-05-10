package OOPs.staticExample;

// out-side classes can not be stattic 

// outside of inner class does not dependenyt on object

//  class Test{
//     String name;

//     public Test(String name){
//         this.name = name;
//     }
// }
 
public class InnnerClasses {

    static class Test{
         String name;
    
         public Test(String name){
             this.name = name;
         }
     }
    public static void main(String[] args) {
        Test obj = new Test("vikas");
        Test obj1 = new Test("kunal");

        System.out.println(obj);

        // System.out.println(obj.name);
        // System.out.println(obj1.name);
    }
}

