package exercisepgm_1;

import java.util.Arrays;

public class MergeTwoArrays {
	
	//replace the first array's zeros with second array merge that way
	public static void arraymerge1(int[] arr3,int[] arr4,int m1,int n1)
	{
		int k=arr3.length-1;
		int l=arr4.length-1;
		while(k>=0 && l>=0)
		{
			if(arr3[k]<arr4[l])
			{
				arr3[k]=arr4[l];
				l--;
			}
			k--;
		}
		System.out.println(Arrays.toString(arr3));
		
		
	}
	
	//merge two arrays using third array in sorting order
	public static void arraymerge(int[] arr1,int[] arr2,int[] res,int m ,int n)
	{
		int k=0;
		int l=0;
		int j=0;
		while(k<m && l<n)
		{
			if(arr1[k]<=arr2[l])
			{
				res[j]=arr1[k];
				k++;
			}
			else
			{
				res[j]=arr2[l];
				l++;
			}
			j++;
			
		}
		
		//if any elements exists in arr1 
		while(k<m)
		{
			res[j]=arr1[k];
			k++;
			j++;
		}
	
		//if any elements exists in arr2
		while(l<n)
		{
			res[j]=arr2[l];
			l++;
			j++;
		}
		System.out.println(Arrays.toString(res));
	}
	
	public static void main(String[] args)
	{
		int[] arr1= {1,4,5};
		int[] arr2= {2,3,8};
		int m=arr1.length;
		int n=arr2.length;
		int[] res=new int[m+n];
		arraymerge(arr1,arr2,res,m,n);
		
		//array merge in single array
		int[] arr3= {1,2,5,0,0,0};
		int[] arr4= {6,7,8};
		int m1=3;
		int n1=3;
		arraymerge1(arr3,arr4,m1,n1);
	}

}
