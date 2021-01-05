package OneDimentionalArray;
import java.util.Scanner;
public class SecondLargestNumber 
{
	public static void main(String args[])
	{
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Limit");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
			{
				temp=max;
				max=arr[i];
				second_max=temp;
			}
			else if(arr[i]>second_max)
			{
				second_max=arr[i];
			}
	}
		System.out.println(second_max);
	}

}
