import java.util.*;
public class PrimeNumberBetween 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting number");
		int start=sc.nextInt();
		System.out.println("Enter a ending number");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(prime(i))
			System.out.println(i);
		}
		
		
	}
	static boolean prime(int no)
	{
		boolean p=true;
		if(no<=1)
		{
			p=false;
			return p;
		}
		else
		{
			for(int i=2;i<=no/2;i++)
			{
				if(no%i==0)
				{
					p=false;
					break;
				}
					
			}
			
		}
		return p;
	}
}