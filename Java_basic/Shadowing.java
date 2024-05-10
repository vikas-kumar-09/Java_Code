
public class Shadowing {
    static int x = 20;
    public static void main(String[] args){
        System.out.println(x); // 20
         int x = 90;
        System.out.println(x); // 90
        fun(); //20
    }
    static void fun(){
        System.out.println(x);
    }
}
