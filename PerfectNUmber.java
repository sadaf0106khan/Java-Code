package Numbers;

import java.util.Scanner;

public class PerfectNUmber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
			System.out.println("given no "+num+ " is perfect");
		else
			System.out.println("not ");
		
	}

}
