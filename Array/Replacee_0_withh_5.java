package Array;

// Replace all zero with five - 
// https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=2&difficulty[]=-1&category[]=Arrays&sortBy=submissions

public class Replacee_0_withh_5 {
    public static void main(String[] args) {
        int  num = 1004;
        System.out.println(convertfive(num));
        
    }
    static int convertfive(int num) {
        // Your code here
        int r;
        int temp=0;
        int sum=1;
        while(num>0){
            r = num%10;
            if(r==0){
                r=5;
            }
            temp+=r*sum;
            sum*=10;
            num = num/10;
        }
        return temp;
    }
}
