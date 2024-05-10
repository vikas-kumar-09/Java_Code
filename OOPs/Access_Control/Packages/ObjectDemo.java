package OOPs.Access_Control.Packages;

public class ObjectDemo {


    // already coverred these 2
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    // we will go in details
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

   

}
