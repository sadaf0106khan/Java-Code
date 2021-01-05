
public class FibRecurrsion
{
	static int a=0,b=1,c;
	static int fib(int no)
	{
		if(no>=3)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fib(no-1);
		}
		return 1;
	}

	public static void main(String args[])
	{
		System.out.print(a+" "+b);
		
		fib(5);
		
    }
}
