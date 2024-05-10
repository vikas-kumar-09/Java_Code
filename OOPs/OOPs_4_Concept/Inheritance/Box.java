package OOPs.OOPs_4_Concept.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;

    }
    // cube 
    Box( double side){

        super();

        this.l = side;
        this.h = side;
        this.w = side;
    }
    
    // parent class of super
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
      this.h = old.h;
      this.l = old.l;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
