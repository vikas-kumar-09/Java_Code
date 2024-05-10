package Array;

// https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions
public class Zig_Zag_Array {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        int n = 5;
      zigZag(arr, n);        
    }
    static void zigZag(int a[], int n){
        // Code your solution here. 
        for(int i=0; i<n-1; i++){
            
            if(i%2==0 && a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            else if(i%2!=0 && a[i]<a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }
}
