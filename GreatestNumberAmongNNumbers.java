package Numbers;
import java.util.*;
public class GreatestNumberAmongNNumbers 
{
	public static void main(String args[])
	{
		int max=Integer.MIN_VALUE;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			num=sc.nextInt();
			
			if(num>=max)
			{
				max=num;
				
			}
		}
		System.out.println("greatest number is "+max);
		
	}
}
