
class Solution {
    public int maxProfit(int[] prices)
     {
       int Maxprofit = 0;
            int buy_price = prices[0];


        for(int i = 0; i < prices.length; i++)
        {
            
           if(prices[i]  < buy_price)
            {
                buy_price = prices[i];
            }    
            else
                {
                    int Current_profit = prices[i] - buy_price;
                    Maxprofit = Math.max(Current_profit, Maxprofit);
                } 
        }
        return Maxprofit;  
     }
}