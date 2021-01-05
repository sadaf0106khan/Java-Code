package interviewquestions;
//tripplet having sum equal to given number or zero
public class TrippletHavingSumZero 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,-3,4,-1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if((a[i]+a[j]+a[k])==0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
					//System.out.println();
					
				}
				//System.out.println();
			}
			//System.out.println();
		}
	}
}
