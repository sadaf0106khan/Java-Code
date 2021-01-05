//square root without using sqrt function
import java.util.*;
public class SquareRoot
{
	static double squareRoot(int number)
	{
		double temp;
		double sqroot=number/2;
		do {
			temp=sqroot;
			sqroot=(temp+(number/temp))/2;
		}
		while((temp-sqroot)!=0);
	return sqroot;
	}
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		System.out.println(squareRoot(no));
		
	}

}
