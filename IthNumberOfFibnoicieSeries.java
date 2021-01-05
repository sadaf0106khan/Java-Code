import java.util.Scanner;
public class IthNumberOfFibnoicieSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		System.out.println(fibNumber(no));
    }
  static int fibNumber(int no)
	{
	   if(no==1)
		   return 0;
	   else if(no==2)
		   return 1;
	   else
		   return fibNumber(no-1)+fibNumber(no-2);
	}

}
