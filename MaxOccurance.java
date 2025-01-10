package exercisepgm_1;

public class MaxOccurance {
	public static void maxoccur(int[] num,int n)
	{
		int i=0;
		int j=n-1;
		int count=1;
		  int maxCount = 0;
		  int maxElement = -1;
		while(i<=j)
		{
			 if(i==j)
			 {
				
			      if (count > maxCount) {
	                    maxCount = count;
	                    maxElement = num[i];
	                }
				
				
				 i++;
				 j=n-1;
				 count=1;
			 }
			 
			 else if(num[i]!=num[j])
			  {
				j--;
				
				
			   }
			else if(num[i]==num[j])
			  {
				
				count++;
				j--;
				
			   }
			
			
		}
		System.out.println(maxElement);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,4,4,5,1,1,1};
		int n=num.length;
		maxoccur(num,n);
		

	}

}
