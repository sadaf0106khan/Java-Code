import java.util.*;
public class MatrixAdditionAndSubstraction 
{

	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter First matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter Second matrix");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition of matrix");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+"   ");
			}
			System.out.println();
		}
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Substraction of matrix");
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
