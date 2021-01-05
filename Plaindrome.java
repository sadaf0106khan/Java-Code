package Numbers;
import java.util.*;
public class Plaindrome 
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int temp=num,rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("Number is Plaindrome ");
		}
		else
			System.out.println("Number is not Plaindrome ");
		sc.close();
	}
}
