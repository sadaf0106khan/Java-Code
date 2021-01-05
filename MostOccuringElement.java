package OneDimentionalArray;

import java.util.Scanner;

public class MostOccuringElement 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Limit");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=Integer.MIN_VALUE;
		int mosttimes=0,mostvalue=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		int[] count=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(count[arr[i]]>mosttimes)
				{
					mosttimes=count[arr[i]];
					mostvalue=arr[i];
				}
		}
		System.out.println(mostvalue+" "+mosttimes);
	}		
}
