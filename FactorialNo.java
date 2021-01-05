package FirstWeek;

import java.util.Scanner;

public class FactorialNo 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int res=factorial(6);
	System.out.println(res);
}	
	
	static int factorial(int no)
	{
		int fact=1;
		if(no>=1)
		{
			
			fact=no*factorial(no-1);
		}
		
		return fact;
	}

}
