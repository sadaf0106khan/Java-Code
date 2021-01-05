package interviewquestions;

import java.util.Scanner;

public class SumOfPrimeNUmber1to100 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int sum=0;
		//System.out.println(primeSum(n));
		for(int i=2;i<=n;i++)
		{
			
			if(primeSum(i))
			{
				sum+=i;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println(sum);
		
	}
	static boolean primeSum(int n)
	{
		if(n<=1)
			return false;
		else
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					return false;
			}
		return true;
	}
}
