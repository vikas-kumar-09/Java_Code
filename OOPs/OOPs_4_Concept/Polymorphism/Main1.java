package OOPs.OOPs_4_Concept.Polymorphism;

public class Main1 {
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        Shape circle = new Circle();
        // Shape circle = new Shape(); another way
        Sqaure sqaure = new Sqaure();
        // Shape sqaure = new Sqaure();  another way
        

        circle.area();

    }
}
