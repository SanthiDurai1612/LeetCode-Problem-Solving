package exercisepgm_1;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static int removeelement(int[] arr,int k)
	{
		int count=0;
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=k)
			{
				arr[count]=arr[i];
				count++;
			}
			
		}
		
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,3,4,5};
		int k=2;
		int res=removeelement(arr,k);
		for(int i=0;i<res;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
