package Numbers;

import java.util.Scanner;

public class SortNumber
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int arr[]=new int[10];
		int result=0;
		while(num!=0)
		{
			int rem=num%10;
			arr[rem]++;
			num=num/10;
			
		}
		for(int i=0;i<=9;i++)
		{
			for(int j=1;j<=arr[i];j++)
			{
				result=(result*10)+i;
					
			}
		}
		System.out.println(result);
	}

}
