package OOPs.staticExample;

public class Main {
    public static void main(String[] args) {
        // Human kunal = new Human(12, "vikas", 12000, false);
        // Human aman = new Human(23, "kumar", 2000, true);
        // Human arpit = new Human(23, "arpit", 2000, true);

        // System.out.println(kunal.salary);
        // whenever you are accessing static variable  or modifiying 
        // dont do it via a reference variable
        // System.out.println(Human.population);
        // System.out.println(Human.population);
        // System.out.println(Human.population);


    }
   // this is not dependent on objects
   // static does not depend on objects
    static void fun(){
        Main obj = new Main();
        obj.greeting();   // you can't use because it requred an instance
    }
      // we know that something which is not static, belongs to an object
    //   this is dependent on objects
      void greeting(){
        System.out.println("Hello world vikas is here");
    }
}
