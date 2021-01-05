package interviewquestions;

import java.util.Scanner;

public class FindSumOfReciprocals 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number till you want to add a reciprocal");
		int n=sc.nextInt();
		float sum=0,temp,rec;
		temp=n;
		while(temp>=1)
		{
			rec=1/temp;
			sum+=rec;
			temp-=1;
			
		}
		
		System.out.println(sum);
	}
}
