package OneDimentionalArray;

import java.util.Scanner;

public class AverageOfNumber 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Limit");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		double avg;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		avg=sum/n;
		System.out.println(avg);
	}
}
