import java.util.*;
public class LadderDiagonalMatrix 
{
	public static void main(String args[])
	{
		int a[][]=new int [3][4],i,j,row=3,col=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a matrix");
		for(i=0;i<3;i++) 
		{
			for(j=0;j<4;j++)
			{
		       a[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<=row-1;k++)
		{
			i=k;
			j=0;
			while(i>=0)
			{
				System.out.print(a[i][j]+"     ");
				i--;
				j++;
			}
			System.out.println();
		}
		for(int k=1;k<=col-1;k++)
		{
			i=row-1;
			j=k;
			while(i>=1)
			{
				System.out.print(a[i][j]+"     ");
				i--;
				j++;
			}
			System.out.println();
		}
	}
}
