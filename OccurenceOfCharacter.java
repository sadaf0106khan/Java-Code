//Occerence of all character in String count
import java.util.*;
public class OccurenceOfCharacter 
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine().toLowerCase();
		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<=str.length()-1;j++)
			{
				if(str.charAt(j)==i)
					count++;
			}
			if(count!=0)
			{
				System.out.print(i+""+count+" ");
			}
			count=0;
		}
		
		
		
		
		
		
	}
}