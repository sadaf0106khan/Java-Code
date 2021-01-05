package Numbers;
import java.util.*;

public class GCD 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		GCD g=new GCD();
		System.out.println(g.gcd(a, b));
	}
	//find greatest common div by recurresion
	int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
}
