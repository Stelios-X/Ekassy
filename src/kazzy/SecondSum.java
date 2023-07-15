package kazzy;

import java.util.HashMap;


public class SecondSum 
{
	//Brute Force approach to the 2 sum problem
	public void GetTwoSum(int[] arr, int sum) 
	{
		if(arr!= null && arr.length > 2) 
		{
			for(int i = 0; i<arr.length; i++) 
			{
				for(int j =i+1; j<arr.length; j++ ) 
				{
					if(sum == arr[i] + arr[j]) 
					{
						System.out.println("The 2 numbers in questiona are "+arr[i]+" and "+arr[j]);
					}
				}
			}
		}
	}
	
	//Two sum solution using HashMap
	public void ObtainTwoSum(int[] arr, int target) 
	{
		int x = 0;
		int key = 0;
		
		//Definition & assignment of the HashMap
		HashMap<Integer, Integer> solmap = new HashMap<>();
		for(int i = 0 ; i < arr.length; i++) 
		{
			solmap.put(i, arr[i]);
		}
		
		for(int element : arr) 
		{
			int compliment = target - element;
			if(solmap.containsValue(compliment)) 
			{
				//System.out.print("the value is "+compliment);
				key = compliment;
				x = 1;
			}
		}
		
		
		
		if(x == 1) 
		{
			System.out.println("the value is "+key);
		}
	   else 
		{
		   System.out.println("No compliment");
		}
		
		
	}

}
