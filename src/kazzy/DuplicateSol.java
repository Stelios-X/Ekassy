package kazzy;

public class DuplicateSol 
{

	//Given an array of integers, the class contains methods that check for duplicates in the array
	//Approach 1 brute force 
	public boolean ContainsDup_br (int[] nums) 
	{
		int x = 0;
		
		for(int i = 0; i < nums.length; i++) 
		{
			for(int j = i+1; j < nums.length; j++) 
			{
				if(nums[i] == nums[j]) 
				{
					x = 1;
					//A duplicate does exist
				}
			}
		}
		//Reporting whether or not the duplicate has been found.
		if(x == 1) 
		{
			//System.out.println("X has a value of " + x);
			return true;
		}
		else 
		{
			//System.out.println("X has a value of " + x);
			return false;
		}
	}
}
