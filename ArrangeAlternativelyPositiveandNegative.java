package interviewquestions;

import java.util.Scanner;

public class ArrangeAlternativelyPositiveandNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array limit");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] brr=new int[n+4];
		int[] crr=new int[n+4];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=0,k=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				brr[j]=arr[i];
				
				j+=2;
			}
			else if(arr[i]>=0)
			{
				crr[k]=arr[i];
				
				k+=2;
			}
		}
		
	}
}
