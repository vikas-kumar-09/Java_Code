package Blind_75_Coding;

//  Sum of two integer without using arthmatic operator
public class SumOfTwoInteger{
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        System.out.println(SumTwoInt(a, b));
        
    }
    static int SumTwoInt(int a, int b){

        while (b != 0) {
            a++;
            b--;
        }
        return a;
    }
}
