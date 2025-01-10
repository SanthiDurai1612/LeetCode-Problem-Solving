package exercisepgm_1;

public class BestTimeToBuyAndSell {
	
	public static void maxprofit(int[] prices)
	{
		int minprice=Integer.MAX_VALUE;
		int maxprice=0;
		for(int i:prices)
		{
			if(i<minprice)
			{
				minprice=i;
			}
			else
			{
				maxprice=Math.max(maxprice, i-minprice);
			}
		}
		System.out.println(maxprice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		maxprofit(prices);
	}

}
