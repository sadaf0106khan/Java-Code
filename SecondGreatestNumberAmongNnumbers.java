package Numbers;

import java.util.Scanner;
public class SecondGreatestNumberAmongNnumbers 
{
	public static void main(String args[])
	{
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			 num=sc.nextInt();
			if(num>=max)
			{
				second_max=max;
				max=num;
			}
			else if(num>=second_max)
				second_max=num;
				
		}
		System.out.println("Second largest number is "+second_max);
	}

}
