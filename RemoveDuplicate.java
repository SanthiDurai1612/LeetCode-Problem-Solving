package exercisepgm_1;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void removedup(int[] arr)
	{
		int k=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				arr[k]=arr[i];
				k++;
			}
		}
	   for(int i=0;i<k;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1
		};
		
		Arrays.sort(arr);
		removedup(arr);

	}

}
