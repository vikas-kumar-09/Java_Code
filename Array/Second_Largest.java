package Array;

public class Second_Largest {
    public static void main(String[] args) {
        int [] arr = {12, 23, 6, 5, 66, 10};
        int num = arr.length;
        int ans = secondLarge1(arr, num);
        // System.out.println(secondLarge(arr, num));
        System.out.println(ans);
        // 
    }
    // second largest in the array

    static int secondLarge1(int [] arr, int num){

        // int num = arr.length; // num = size of the array

        if(num < 2){
            System.out.println("Array does't have 2nd_max element");
            return -1;
        }
          int largest = Integer.MIN_VALUE;
          int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<num; i++){
            
            if(arr[i] > largest){
                secondLargest = largest;
                largest = i;
            }
            else if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

//     static int secondLarge(int[] arr, int n){

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){

//                 if(arr[i] > arr[j]){
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         return arr[n-2];
//     }
// }

    // second largest in the array

   