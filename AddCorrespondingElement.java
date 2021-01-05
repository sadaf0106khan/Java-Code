package OneDimentionalArray;
//add corresponding element of array and reverse array
import java.util.*;
public class AddCorrespondingElement
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range Of Array");
		int n=sc.nextInt();
		int i,j=n;
		int[] arr=new int[n];
		int[] brr=new int[n];
		int[] crr=new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			brr[j-1]=arr[i];
			j--;
		}
		for(i=0;i<arr.length;i++)
		{
			crr[i]=brr[i]+arr[i];
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(crr[i]);
		}
	}
}
