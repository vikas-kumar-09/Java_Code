package OOPs.AbstractClass_Demo;

public class Daughter extends Parent {

    @Override
    void career(String name) {
        System.out.println(" I am goin to be " + name);
    }

    @Override
    void partner(String name, int age) {
      System.out.println("I love " + name + " He is  " + age);
    }
    
}
