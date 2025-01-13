package exercisepgm_1;

public class JumpIndex2 {
	public static int jumpindex(int[] nums,int n)
	{
		int jump=0;
		int currentend=0;
		int farthest=0;
		
		if(n==1)
		{
			return 0;
		}
		for(int i=0;i<n-1;i++)
		{
			farthest=Math.max(farthest, i+nums[i]);
			if(i==currentend)
			{
				jump++;
				currentend=farthest;
				if(currentend>=n-1)
				{
					break;
				}
				
			}
		}
		return jump;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int[] nums= {2,3,0,1,4};
       int n=nums.length;
       int jumpcount=jumpindex(nums,n);
       System.out.println(jumpcount);
	}

}
