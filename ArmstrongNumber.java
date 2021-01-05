
package Numbers;
import java.util.*;
public class ArmstrongNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int temp=num,len=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			len++;
			temp=temp/10;
		}
		System.out.println(len);
		int t2=num;
		int arm=0;
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(num==arm)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
		
	}
}
