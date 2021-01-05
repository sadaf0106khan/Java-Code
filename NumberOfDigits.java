package Numbers;

import java.util.Scanner;

public class NumberOfDigits 
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int index=0;int count=0;
		while(num>0)
		{
			int rem=num%10;
			arr[index]=rem;
			index++;
			num=num/10;
		}
		for(int i=0;i<=arr.length;i++)
		 System.out.println(arr[i]);
	}
		
		
	

}
