package kazzy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

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
					//In this case, a duplicate does exist
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
	
	
	//Approach 2 sorting before applying Brute Force, sorting ensures that the search for the duplicate is less complicated
	public boolean ContainsDuplicate_Sr(int[] myarray) 
	{
		int x = 0;
		Arrays.sort(myarray);
		for(int i = 0;i<myarray.length; i++) 
		{
			for(int j = i+1; j<myarray.length;j++) 
			{
				if(myarray[i] == myarray[j]) 
				{
					x = 1;
				}
			}
		}
		if(x == 1) 
		{
			//System.out.println("Duplicates are present");
			return true;
		}
	   else 
		{
		   //System.out.println("No duplicates in this array");
			return false;
		}
	}
	
	
	//Approach 3 HashSet implementation
	public boolean ContainsDuplicate_HS(int[] thearray) 
	{
		int x = 0;
		
		HashSet<Integer> newset = new HashSet<>();
		for(int element : thearray) 
		{
			if(newset.contains(element)) 
			{
				x = 1;
			}
			newset.add(element);
		}
		
		if(x == 1) 
		{
			//System.out.print("There are duplicates present");
			return true;
		}
	   else 
	   {
		  // System.out.print("No duplicates present");
		   return false;
	   }
		
		
	}
	
	//Approach 4 HshMap implementation
	public boolean ContainsDuplicate_HM(int[] myarr) 
	{
		int x = 0;
		HashMap<Integer, Integer> newmap = new HashMap<>();
		for(int element : myarr) 
		{
			if(newmap.containsKey(element) && newmap.get(element) >= 1) 
			{
				x = 1;
			}
			newmap.put(element, newmap.getOrDefault(element, 0) + 1);
		}
		
		if(x == 1) 
		{
			//System.out.println("Duplictaes are present");
			return true;
		}
	   else 
	   {
		   //System.out.println("Duplicates are absent");
		   return false;
	   }
		
	}
	
	
}
