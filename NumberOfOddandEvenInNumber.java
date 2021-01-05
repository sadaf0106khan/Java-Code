package Numbers;
import java.util.*;
public class NumberOfOddandEvenInNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num,rem,even=0,odd=0;
		while(temp!=0)
		{
			rem=temp%10;
				if(rem%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
				temp=temp/10;
		}
		System.out.println("Even digits "+even+" ,"+"Odd digits "+odd);
		
	}
}
