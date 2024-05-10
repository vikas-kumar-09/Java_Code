package Time_Complexity;

public class FiboFormula {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println(fiboFormula(i));
        }
        
    }
    static int fiboFormula(int n){
          // just for demo, use long instead
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
