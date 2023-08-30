package kazzy;

public class Program {

	public static void main(String[] args) 
	{
		int [] myarr = {1,2,4,6,7};
		 //int[] prices = {-2,1,-3,4,-1,2,1,-5,4};
		 
		 //MaximumSubarray sub = new MaximumSubarray();
		 //sub.maxSubArray(prices);
		
		SecondSum newsum = new SecondSum();
		 newsum.twoSumSolution(myarr, 9);
		// TODO Auto-generated method stub
		/*SecondSum second_sum = new SecondSum();
		second_sum.GetTwoSum(myarr, 10);*/
		
		
	}

}
