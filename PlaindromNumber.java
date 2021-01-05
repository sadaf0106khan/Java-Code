import java.util.*;
public class PlaindromNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0,rem;
		//following code is for plaindrome
		while(temp!=0)
		{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		if (rev==num)
			System.out.println("number is plaindrome");
		else
			System.out.println("number is not plaindrome");
	}
	
	
}

