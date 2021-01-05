package Numbers;
import java.util.*;
public class GreatestNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		System.out.println("Enter Third number");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("greatest num is" +num1);
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("greatest num is" +num2);
		}
		else
		{
			System.out.println("greatest num is" +num3);
		}
			
	}
}
