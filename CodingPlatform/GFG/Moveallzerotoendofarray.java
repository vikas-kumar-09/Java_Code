package CodingPlatform.GFG;

public class Moveallzerotoendofarray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 0, 0, 4};
        int num = arr.length;
        // System.out.println(arr);
        for(int num2 : arr){
            System.out.print(num2+" ");
        }
        System.out.println();
        moveallzerotoendofarray(arr, num);
        for(int num1 : arr){
            System.out.print(num1+" ");
        }
        System.out.println();

        // System.out.println(arr[i]);
        // pushZerotoEnd(arr, arr.length);
        // for(int num : arr){
        //     System.out.print(num+" ");
        // }
        // System.out.println();
    }

    static void moveallzerotoendofarray(int[] arr, int n){

        int count = 0;  // count of non zero element

        for(int i=0; i<n; i++){

            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }
    }  
}
    // static int  pushZerotoEnd(int[] arr, int n){

    //     int nonZeroIndex  = 0;   //nonZeroIndex = count

    //     for(int i=0; i<n; i++){

    //         if(arr[i]!=0){
    //             int temp = arr[i];
    //             arr[i] = arr[nonZeroIndex];
    //             arr[nonZeroIndex] = temp;
    //             nonZeroIndex++;
    //         }
    //     }
    //     return 1;
    // }

    // Alternative solution

   
