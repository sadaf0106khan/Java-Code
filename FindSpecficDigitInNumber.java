package Numbers;

import java.util.Scanner;

public class FindSpecficDigitInNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Enter a specfic number");
		int spnum=sc.nextInt();
		int temp=num;
		int rem;
		int count=0;
		while(temp!=0)
		{
			rem=temp%10;
				if(rem==spnum)
				{
					System.out.println("yes this "+spnum+" is exist");
					count++;
				    break;
				}
			    
			temp=temp/10;
		}
		if(count==0)
			System.out.println("Digit not found");
		
	}
}
