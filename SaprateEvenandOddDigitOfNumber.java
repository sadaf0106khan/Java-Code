package Numbers;

import java.util.Scanner;

public class SaprateEvenandOddDigitOfNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int even=0,odd=0;
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even=(even*10)+rem;
			}
			else
			{
				odd=(odd*10)+rem;
		    }
			num=num/10;
		}
		System.out.println(even+" "+odd);
	}

}
