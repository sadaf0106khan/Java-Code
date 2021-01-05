package OneDimentionalArray;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array limit");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] brr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=1;j<=arr.length-1;j++)
			{
				if(arr[i]!=arr[j])
				{
					brr[i]=arr[i];
					
				}
			}
			System.out.print(brr[i]+" ");
		}
		
		
		
		
		
		//using HashSet for removing element
		
//		HashSet<Integer> hs=new HashSet<>();
//		for(int i=0;i<arr.length;i++)
//		{
//		hs.add(arr[i]);
//		}
//		System.out.println("after removing duplicates");
//		for(int no:hs)
//		{
//			
//		System.out.print(no+" ");
//		}
	}
}
