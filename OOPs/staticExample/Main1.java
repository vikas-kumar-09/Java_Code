package OOPs.staticExample;

public class Main1 {
    public static void main(String[] args) {

        // Main1 funn = new Main1();
        // funn.fun2();
        fun();
        
    }
    static void fun(){
        // Main1 obj = new Main1();
        // obj.greeting();   // you can't use because it requred an instance
 
        // you cannot access non static stuff without referencing thrie instance in a static context

        // hence , here i am referencing it.

        Main1 obj = new Main1();
        obj.greeting();
    }
      // we know that something which is not static, belongs to an object
    //   this is dependent on objects

    // void fun2(){
    //     greeting();
    // }

      void greeting(){
        System.out.println("Hello world  here");
    }
}
