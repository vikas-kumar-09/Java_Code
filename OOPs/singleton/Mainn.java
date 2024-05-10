package OOPs.singleton;

import OOPs.Access_Control.Packages.A;

public class Mainn {
    public static void main(String[] args) {
        
        Singleton obj = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        A a = new A();
        a.getNum();
    }
}
