package interviewquestions;

import java.util.Scanner;

public class ReverseStringUsingRecurrsion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.print(reverseString(str));
		sc.close();
		
	}
	
	static String reverseString(String str)
	{
		if(str.length()==0)
			return str;
		return reverseString(str.substring(1))+str.charAt(0);
	}
		
}
