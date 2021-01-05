package interviewquestions;

import java.util.Scanner;

public class ReverseTheWordOfTheString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String [] word=str.split(" ");
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i]+" ");
		}
			
	}
}
