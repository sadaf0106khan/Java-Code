package FirstWeek;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary
{
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
//	Stack<Integer> s=new Stack<>();
//	while(num>0)
//	{
//		int d=num%2;
//		s.push(d);
//		num=num/2;
//	}
//	while(!s.isEmpty())
//	{
//	System.out.print(s.pop());
//	}
	
	String str=Integer.toBinaryString(num);
	System.out.println(str);
	}
}
