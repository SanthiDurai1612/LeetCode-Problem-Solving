package exercisepgm_1;

import java.util.Arrays;

public class RotateArr {

    public static void rotate1(int[] nums, int k) {
    	int n=nums.length;
    	for(int i=0;i<k;i++)
    	{
    		int lastelement=nums[n-1];
    		for(int j=n-1;j>0;j--)
    		{
    			nums[j]=nums[j-1];
    		}
    		nums[0]=lastelement;
    	}
    	System.out.println(Arrays.toString(nums));
       
    }
    
    
    public static void rotate2(int[] nums, int k) {
    	int n=nums.length;
    	k=k%n;
    	int[] arr=new int[n];
    	
    	for(int i=0;i<n;i++)
    	{
    		int newindex=(i+k)%n;
    		arr[newindex]=nums[i];
    	}
    	System.out.println(Arrays.toString(arr));
        
    }

    public static void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

     
        reverse(nums, 0, n - 1);

       
        reverse(nums, 0, k - 1);

       
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums)); 
    }

   
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }




    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        //first method to solve this pblm
        rotate1(nums, k);
        
      int nums1[] = {1, 2, 3, 4, 5, 6, 7};
       k = 3;
        
      //second method to solve this pblm
        rotate2(nums1, k);
        
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7};
         k = 3;
         int start=0;
         int end=nums2.length-1;
        
         //third method to solve this pblm
        rotate3(nums2, k);
    }
}
