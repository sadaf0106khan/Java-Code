import java.util.*;
public class FactorialRecurrsion
{	
	static int fact=1;
	static int factorial(int num)
	{
		if(num>=1)
		{
		fact=fact*num;
		factorial(num-1);
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(factorial(num));
	}
}
