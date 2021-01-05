import java.util.*;
public class MatrixMultiplication 
{
	public static void main(String[] args)
	{
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int c[][]=new int [3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		//System.out.println("Matrix Multiplication :");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<c.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				
			}
		}
		System.out.println("Matrix Multiplication :");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+"   ");
			}
			System.out.println();
		}
		
		
	}

}
