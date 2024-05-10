package Recursion.Recursion_Pattern_Question;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {4, 3, 1, 2};
        selection_Sort(arr, arr.length, 0, 0);
        System.out.println(arr);
    }
    static void selection_Sort(int[] arr, int r, int c, int max){
        if( r == 0){
            return;
        }
        if(c < r)
            if(arr[c] > arr[max]){
                selection_Sort(arr, r, c+1, c);
            }
            else{
                selection_Sort(arr, r, c+1, max);
            }
            else{
                int temp = arr[max];
                arr[max] = arr[r-1];
                arr[r-1] = temp;
            }
            selection_Sort(arr, r-1, c=0, 0);
            
        }
    }

