package Numbers;

import java.util.Scanner;
public class Increment 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=sc.nextInt();
		int b=a++;
		System.out.println("value of a after incerment: "+a);
		System.out.println("value if b "+b);
		int c=++a;
		System.out.println("value of a "+a);
		System.out.println("value of c "+c);
		int d=--a;
		System.out.println("value of a "+a);
		System.out.println("value of d "+d);
		int e=a--;
		System.out.println("value of a "+a);
		System.out.println("value of e "+e);
	}
}
