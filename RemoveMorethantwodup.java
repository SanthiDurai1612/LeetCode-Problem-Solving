package exercisepgm_1;

import java.util.Arrays;

public class RemoveMorethantwodup {

	 public static void removeDuplicates(int[] nums) {

	        int k=2;
	        
	        for(int i=2;i<nums.length;i++)
	        {
	            if(nums[i]!=nums[k-2])
	            {
	                nums[k]=nums[i];
	                k++;
	            }
	          
	        }
	        for(int i=0;i<k;i++)
	 	   {
	 		   System.out.print(nums[i]+" ");
	 	   }
	        
	    }
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] nums= {1,1,1,2,2,3
			};
			
			Arrays.sort(nums);
			removeDuplicates(nums);

		}

}
