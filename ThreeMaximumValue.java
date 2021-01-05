package FirstWeek;

import java.util.Scanner;

//wap to find three maximum value in array
public class ThreeMaximumValue 
{
	 public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array limit");
		int num=sc.nextInt();
		int a[]=new int[num];
		int temp;
		int max=Integer.MIN_VALUE;
		int s_max=Integer.MIN_VALUE;
		int t_max=Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
				
			
			
				if(a[i]>max)
				{
					temp=max;
					max=a[i];
					s_max=temp;
				}
				else if(a[i]>s_max)
				{
					temp=s_max;
					s_max=a[i];
					t_max=temp;
				}
				else if(a[i]>s_max)
				{
					s_max=a[i];
				}
				else if(a[i]>t_max)
				{
					t_max=a[i];
					
				}
					
					
				
			
			}
			System.out.println(max);
			System.out.println(s_max);
			System.out.println(t_max);
	 }
}
