package Strings;

// print all the substring of a string
public class SubString_OfString {
    public static void main(String[] args){
        char str[] = {'a', 'b'};
        substring1(str);
        
    }

    static void substring1(char[] str){

        int n = str.length;

        for(int i=0; i<n; i++){

            for(int j=i; j<n; j++){
                // print from i--> j

                for(int k=i; k<=j; k++){
                    System.out.print(str[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
