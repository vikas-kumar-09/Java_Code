package Searching1;

public class WrapperExample {
    public static void main(String[] args) {
        
        // int a = 10;

        // creating an object
        Integer num1 = 10;

        Integer num2 = 20;
        swap(num1, num2);
        System.out.println(num1 + " " + num2);

        final A kunal = new A("vikas kumar");
        kunal.name = "other name";
        // when a non primitive in final , you can not resign it.
        // kunal = new A("new objcet");

        A obj = new A("vikashhhhh");
        System.out.println(obj);

        for(int i=0; i<1000000000; i++){
            obj = new A ("vikas kumar");
        }
        
    }
    static void swap(Integer a, Integer b){

        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
   final int a =10;
   String name;

   public A (String name){
    // System.out.println("object is created");
    this.name = name;
   }

   @Override
   protected void finalize() throws Throwable {
       // TODO Auto-generated method stub
       System.out.println("object is destruoyed");
       // what to do when memory is getting free
   }

}
