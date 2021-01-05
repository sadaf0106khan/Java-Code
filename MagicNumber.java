package Numbers;

import java.util.Scanner;

public class MagicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=num;
		int temp=num;
		int rem;
		while(sum>9)
		{
			temp=sum;
			sum=0;
			while(temp!=0)
			{
				rem=temp%10;
				sum+=rem;
				temp=temp/10;
			}
			
		}
		
		
		
		if(sum==1)
		{
			System.out.println("is a magic number");
		}
		else
			System.out.println("not a magic num");
		
		
		
		
		//System.out.println(sum);
		
		
		
		sc.close();
	}
}
