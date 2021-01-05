package Numbers;
import java.util.*;
public class TotalNoOfPrimeNumber 
{
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(prime(i))
			{
				System.out.print(i+" ");
				count++;
			
			}
		
		}
		System.out.println();
		System.out.println("No of primeno: "+count);
		
	}
	
	static boolean prime(int n)
	{
		if(n<=1)
			return false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
				return false;
				}
			}
		}
		return true;
	}
	

}
