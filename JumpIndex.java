package exercisepgm_1;

public class JumpIndex {
	public static boolean jump(int[] arr)
	{
		
		int farthest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i>farthest)
			{
				return false;
			}
			farthest=Math.max(farthest, i+arr[i]);
			if(farthest>=arr.length-1)
			{
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,1,0,4};
		int start=1;
		boolean flg=jump(arr);
		System.out.print(flg);
		

	}

}
