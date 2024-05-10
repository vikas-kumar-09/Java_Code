package CodingPlatform.GFG;

// Remove duplicate from srted array
public class RemoveDupFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {-1, -2, -3, -3, 5};
        int n = arr.length;

        n = removeDupFromSortedArray(arr, n);
        
        for(int i=0; i<n; i++){


            System.out.print(arr[i] + " ");
        }
    }
    static int removeDupFromSortedArray(int [] arr, int n){

        if (n == 0 || n == 1)
            return n;
 
        int[] temp = new int[n];
 
        // Start traversing elements
        int j = 0;   // j = count
        for (int i = 0; i < n - 1; i++)
             
            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
 
        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];
 
        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        return j;
    }
}
    
