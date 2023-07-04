package kazzy;

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

}
