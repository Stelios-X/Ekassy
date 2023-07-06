package kazzy;

public class Stock 
{
	//This class calculates the maximum profit that can be obtained from buying and selling stocks
	public int MaxProfit (int[] prices) 
	{
		int minPrice = Integer.MAX_VALUE;
		int profit = 0;
		int maxProfit = 0;
		
		
		for(int i = 0; i<prices.length; i++) 
		{
			if(prices[i] < minPrice) 
			{
				minPrice = prices[i];
			}
			
			profit = prices[i] - minPrice;
			
			if(profit > maxProfit) 
			{
				maxProfit = profit;
			}
		}
		
		
		System.out.println("The maximum profit is "+maxProfit);
		return maxProfit;
	}
}
