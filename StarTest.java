package OneDimentionalArray;

import java.util.Scanner;

public class StarTest 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int m=2;m<=i;m++)
				{
					System.out.print("*");
				}
			
			System.out.println();
		}
		//second way for printing praymid
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
