package CodingPlatform.GFG;

public class CountZeroInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 5, 0, 3, 0, 1, 0};
        
        System.out.println(countZeroInArray(arr));
        
    }
    static int countZeroInArray(int [] arr){
          int count = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] == 0){
                count++;
            }
        }
        return count;
    }
}
