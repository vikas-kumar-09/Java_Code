package Searching1.bsQuestion;

public class SmallestLetter {
    public static void main(String[] args) {
        char [] letters = {'c', 'f', 'j'};
        char target = 'j';
        char ans = nextGreaterElement(letters, target);
        System.out.println(ans);
        
    }
    static char nextGreaterElement(char[] letters, int target){
        // what if the target number is the greatest in the array

    //    if(target > arr[arr.length-1]){
    //        return -1;
    //    }

       int start = 0;
       int end = letters.length-1;

       while(start <= end){

           int mid = start + (end - start)/2;

           if(target > letters[mid]){
               start = mid +1;
           }
           else if( target < letters[mid]){
               end = mid-1;
           }
       }
       return letters[start % letters.length];
   }
}
