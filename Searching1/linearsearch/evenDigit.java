package Searching1.linearsearch;

// find no of nos. that has even numbers of digits ( leetcode problem)
public class evenDigit {
    public static void main(String[] args) {
        int [] nums = {12, 345, 2, 6, 7896, 8888};
        System.out.println(findNumber(nums));
        System.out.println(digits(-2432794));
        // System.out.println(even(45678));
        
    }
    static int findNumber(int[] nums){
        int count =0;

        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }
    // function to check whether a contains even digits ot not or it is even ot not
    static boolean even(int num){
        int numberofDigit = digits(num);
        return numberofDigit % 2 == 0;
    }
    
     // count number of digits in a number
    static int digits(int num){
        int count =0;
        // edge cases
          if(num < 0){
            num = num * -1;
          }
          if(num == 0){
            return 1;
          }
        while(num > 0){
            count++; 
            num = num / 10;
        }
        return count;
    }
    // return count;
}
