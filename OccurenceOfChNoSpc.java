package StringExamples;

import java.util.Scanner;

public class OccurenceOfChNoSpc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine().toLowerCase();
		int no=0,spc=0,vow=0,con=0,ch=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=48&&str.charAt(i)<=57)
			{
				no++;
			}
			else if(str.charAt(i)>=97&&str.charAt(i)<=122)
			{
				ch++;
			}
			else if((str.charAt(i)>=33&&str.charAt(i)<=47)||(str.charAt(i)>=58&&str.charAt(i)<=64)||(str.charAt(i)>=91&&str.charAt(i)<=96))
				
			{
				spc++;
			}
		}
		System.out.println("digits ="+no);
		System.out.println("character "+ch);
		System.out.println("special character "+spc);
	}
}
