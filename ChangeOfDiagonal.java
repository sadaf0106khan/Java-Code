package MultiDimentionalArray;

import java.util.Scanner;

public class ChangeOfDiagonal 
{
	public static void main(String[] args)
	{
	   
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a no of nxn matrix");
	    int n=sc.nextInt();
	    int a[][]=new int[n][n];
	    System.out.println("Enter a matrix");
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	
		for(int i=0;i<n;i++)
		{
			int temp=a[i][i];
			a[i][i]=a[i][n-i-1];
			a[i][n-i-1]=temp;

		}
		for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		System.out.print(a[i][j]);
	    	}
	    	System.out.println();
	    }
	}
}
