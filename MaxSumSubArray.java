package OneDimentionalArray;

public class MaxSumSubArray 
{
	public static void main(String args[])
	{
//		int[] arr= {-1,-3,-4,-6,-5,-4,-7,-8,-5,-9,-10};
//		int len=arr.length;
//		int max=Integer.MIN_VALUE;
//			for(int i=0;i<len;i++)
//			{
//				for(int j=i;j<len;j++)
//				{
//					int current_sum=0;
//					for(int k=i;k<=j;k++)
//					{
//						current_sum=current_sum+arr[k];
//					}
//					if(current_sum>max)
//					{
//						max=current_sum;
//					}
//				}
//			}
		//kaden's algorithm
		int [] arr= {-2,-3,4,-1,-2,1,5,-3};
		int max=Integer.MIN_VALUE;
		int current_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			current_sum=current_sum+arr[i];
			
			if(current_sum>max)
			{
				max=current_sum;
			}
			if(current_sum<0)
			{
				current_sum=0;
			}
		}
			System.out.println(max);
	}
}
