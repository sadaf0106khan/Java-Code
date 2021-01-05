package Numbers;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String[]args)
	{
		PrimeNumber p=new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		//boolean b=p.prime(num);
		int b=p.prime(num);
		System.out.println(b);

	}
	
  int prime(int num)
	{
		int temp=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				temp++;
			}
		}
		if(temp>0)
		{
			System.out.println(num+" is not prime");
		}
		else if(num<=1)
			System.out.println(num+" is not prime");
		else
		{
			System.out.println(num+" is prime");
		}
	return 1;
	
//		boolean prime(int num)
//		{
//			boolean result=true;
//			if(num<=1)
//				return result =false;
//			else
//			{
//				for(int  i=2;i<=num/2;i++)
//				{
//					if(num%i==0)
//						return result=false;
//					
//				}
//			}
//			return result;
		
	    }
}
