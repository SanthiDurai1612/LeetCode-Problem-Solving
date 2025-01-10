package exercisepgm_1;

public class BestTimeToBuyAndSell2 {

	public static void addoftwomaxprofit(int[] prices)
	{
		 int totalProfit = 0;
	        
	        // Traverse through the prices array
	        for (int i = 1; i < prices.length; i++) {
	            // If current price is greater than the previous price, profit can be made
	            if (prices[i] > prices[i - 1]) {
	                totalProfit += prices[i] - prices[i - 1];
	            }
	        }
		System.out.println(totalProfit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,6,4,3,1};
		addoftwomaxprofit(prices);

	}

}
