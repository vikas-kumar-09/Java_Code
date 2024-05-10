package Array1_Practice;

public class Second_largest_Element {
    public static void main(String[] args) {
        int [] arr = {12, 34, 1, 3, 5, 7, 8, 9};
        int ans = secondLarge(arr, 0);
        System.out.println(ans);
        
    }
    static int secondLarge(int[] arr, int n){

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n-2];
        
    }
}
