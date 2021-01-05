import java.util.*;
public class Fibnoacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
	
		fibSeries(number);
	}
		
	static	int fibSeries(int number)
		{
			
			int a=0,b=1,c;
			System.out.print(a+" "+b);
			for(int i=3;i<=number;i++)
			{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			}
			return 1;
		}
 }

