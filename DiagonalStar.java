package starpattern;
import java.util.Scanner;
public class DiagonalStar 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=2&&j<=i-1)
				{
				System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i>=2&&k>1)
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
