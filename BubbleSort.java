package interviewquestions;

import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		int a[]= {2,4,5,3,6,-3};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
}
