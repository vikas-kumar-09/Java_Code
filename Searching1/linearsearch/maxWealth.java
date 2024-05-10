package Searching1.linearsearch;

// https://leetcode.com/problems/richest-customer-wealth/ (Richest Customer Wealth)

public class maxWealth {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 7},
        //     {3, 6, 9}
        // };
        // System.out.println(maximumWealth(new int[3][3]));
        
    }
    public int maximumWealth(int[][] accounts){
            // person = row
            // account = col
            int max = Integer.MIN_VALUE;
        for(int[] arr1 : accounts){
            int sum = 0;   // sum = rowSum
            // when you start a new col, take a sum of that col
            for(int arr2 : arr1){
                sum = sum + arr2;
            }
        // for(int person =0; person < accounts.length; person++){
        //     int sum  = 0;
        //     for(int account=0; account<accounts[person].length; account++){

        //         sum += accounts[account][person];
        //     }
        // }
            // now we have sum the accounts of person
            // now  we will check with overall ans
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
    
}
