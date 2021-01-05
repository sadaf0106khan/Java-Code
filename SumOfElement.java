package OneDimentionalArray;
import java.util.Scanner;
public class SumOfElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=sc.nextInt();
			arr[i]=num;
			sum=sum+arr[i];
			 
		}
		
		System.out.print(sum);
		
		
	}
}
