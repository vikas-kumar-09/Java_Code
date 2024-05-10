package CodingPlatform.GFG;

// Best _time_to_Buy_and_Sell_Stock to get max_profit
// https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/
public class Buy_Sell_Stock{
    
    public static void main(String[] args){
        int prices[] = { 7, 1, 5, 6, 4 };
        int n = prices.length;
        int max_profit = maxprofit(prices, n);
        System.out.println(max_profit);
        
    }

    static int maxprofit(int[] arr, int n){

        int buy = arr[0];
        int max_profit = 0;

        for(int i=0; i<n; i++){
            // Checking for lower buy value
             if(buy > arr[i])
             {
                buy = arr[i];
             }
            //  Checking for max/higher  profit
             else if(arr[i] - buy > max_profit){
                max_profit = arr[i]- buy;
             }
        }
        return max_profit;
    }
}
