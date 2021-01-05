package stringExamples;

import java.util.*;

public class RepeatedWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		int count=0;
		for(int i=0;i<=words.length-1;i++)
		{
			for(int j=i+1;j<=words.length-1;j++)
			{
				if(words[i]==words[j])
				{
					count++;
				}
				System.out.println(count);
			}
		}
		
		//for(int i=0;i<=words.length-1;i++)
			
	}
}
