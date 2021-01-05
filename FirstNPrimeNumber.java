package Numbers;
import java.util.*;
public class FirstNPrimeNumber 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int count=0,i=2;
		while(count<n)
		{
			if(isPrime(i))
			{
				System.out.print(" "+i);
				count++;
			}
			i++;
		}
		
	}
	
	
	
	
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		else
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		return true;
	}
	

}
