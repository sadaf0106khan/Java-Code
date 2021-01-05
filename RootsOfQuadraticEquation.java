package interviewquestions;

import java.util.Scanner;

public class RootsOfQuadraticEquation 
{
	public static void main(String[] args) 
	{
		double a,b,c,root1,root2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextDouble();
		System.out.println("Enter value of b");
		b=sc.nextDouble();
		System.out.println("Enter value of c");
		c=sc.nextDouble();
		double discreminant=(b*b-4*a*c);
		
		//for real root
		if(discreminant>0)
		{
			root1=(-b+Math.sqrt(discreminant))/(2*a);
			root2=(-b-Math.sqrt(discreminant))/(2*a);
		System.out.printf("root1=%.2f and root2=%.2f",root1,root2);
		}
		//for real and equal root
		else if(discreminant==0)
		{
			root1=root2=(-b/(2*a));
			System.out.printf("root1=root2=%.2f",root1);
		}
		//for imaginary
		else if(discreminant<0)
		{
			double realpart=(-b/(2*a));;
			double imaginarypart=(Math.sqrt(-discreminant)/(2*a));
			System.out.printf("%.2f+.2fi and %.2f-.2fi",realpart,imaginarypart,realpart,imaginarypart);
		}
		
		
		
	}
	
}
