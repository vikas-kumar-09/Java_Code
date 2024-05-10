package OOPs.OOPs_4_Concept.Polymorphism;

public class Circle extends Shape {
    // @Override
    // this will  run when ibj of circle is created
    // hence it is overriding the parent method
    @Override   // this is called annotation
    void area(){
        System.out.println(" I am circle vikas");
    }
}
