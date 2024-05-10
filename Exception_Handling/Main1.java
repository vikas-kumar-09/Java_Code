package Exception_Handling;

public class Main1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            // divide(a, b);
            // int c = a / b;
            // mimicing
            // throw new Exception("Just for fun");
            String name = "vikas";
            if(name.equals("vikas")){
                throw new MyException("Name is vikas");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());  
            }
        catch(ArithmeticException e){
        System.out.println(e.getMessage());  
        }
        catch(Exception e){
            System.out.println("Normal Exceptiion");
              
            }

        finally{
            System.out.println("This will run always");
        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        //   return a / b;
        if (b == 0) {
          throw new ArithmeticException("Please do not divide ny zero");
        }
        return a / b;
    }
  
}
