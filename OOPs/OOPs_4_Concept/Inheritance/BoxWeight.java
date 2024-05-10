package OOPs.OOPs_4_Concept.Inheritance;

public class BoxWeight  extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h,double weight) {
        super(l, w, h); 
        // call the parent class constructor
        // used to initialized values parent in parent class
        this.weight = weight;
    }

    BoxWeight(double side, double weight){
          super(side);
          this.weight = weight;
    }
     
    
}
