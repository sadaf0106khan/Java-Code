import java.util.*;
public class StringExamples 
{
	public static void main(String []args)
	{
		/*
		 * String str="uday veer singh"; char a[]= {'u','d','a','y'}; byte b[]=
		 * {97,98,99,100,65,66,68,69}; String str2=new String(a); String str3=new
		 * String(b); System.out.println(str.replace('e','b'));
		 * System.out.println(str.length()); System.out.println(str.toUpperCase());
		 * System.out.println(str.toLowerCase()); System.out.println(str.isEmpty());
		 * System.out.println(str.substring(3)); System.out.println(str2);
		 * System.out.println(str3); System.out.println(str.indexOf('e'));
		 * System.out.println(str.lastIndexOf('e'));
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your city name: ");
		String name=sc.nextLine().toLowerCase().trim();//this trim method is used for removing white spaces either from begning or end of the string
		//System.out.println(name.trim().length());//trim method is not working on removing spaces between two words
		if(name.equals("chennai"))
			System.out.println("hello chennai ");
		else
			System.out.println("enter valid cityname ");
	}
	
}
