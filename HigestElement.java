package OneDimentionalArray;
import java.util.Scanner;
public class HigestElement 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=Integer.MIN_VALUE;
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max) 
			{
				temp=max;
				max=arr[i];
				
			}
				
		}
		System.out.println(max);
	}
}
