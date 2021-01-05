package interviewquestions;

import java.util.Scanner;

public class pyramidpattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of line");
		int n=sc.nextInt();
		int m=1;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("   ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+m+" ");;
				m++;
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print(" "+m+" ");
				m++;
			}
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		
	}

}
