package Numbers;
import java.util.*;
public class DigitsOfNumbers 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int arr[]=new int[10];
		
		int rem;
		while(num!=0)
		{
			rem=num%10;
			arr[rem]++;
			num=num/10;
		}
		for(int i=0;i<=9;i++)
		{
			if(arr[i]!=0)
			{
					System.out.println(i+ " = "+ arr[i]+" times");
			}
		}
	}
}
