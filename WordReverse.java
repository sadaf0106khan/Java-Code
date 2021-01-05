package StringExamples;
//import java.util.Scanner;
public class WordReverse 
{
	public static void main(String args[])
	{
		String str="java is the programming language",str2="",str3="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				str2=str2+str.charAt(i);
			}
				
		}
		int j=0;
		for(int i=0;i<=len-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				str3=str3+' ';
			}
			else
			{
				str3=str3+str2.charAt(j);
				j++;
			}
				
		}
		System.out.println(str3);
	}

}
