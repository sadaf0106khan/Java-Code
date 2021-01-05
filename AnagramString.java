package interviewquestions;

import java.util.Scanner;
import java.util.Arrays;
public class AnagramString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		System.out.println("Enter Second String");
		String str2=sc.nextLine();
		anagram(str1, str2);
		
	}
	static void anagram(String str1,String str2)
	{
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b))
		{
			System.out.println("String Anagram");
		}
		else
			System.out.println("Not Anagram");
		
	}
}
