
public class BinarySearch 
{
	public static void main(String[] args)
	{
		//this code for sort(use bubble sort) the array
		int a[]= {1,2,5,3,4,7,9,8,6};
		int temp;
		int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		
			System.out.println(a[i]);
			
		}
		
		System.out.println(" " +len);//this is only for print length
		
			 
		//folllowing code for Binary search
			int li=0;
			int hi=a.length-1;
			int mi=(li+hi)/2;
			int search=1;
			while(li<=hi)
			{
				if(a[mi]==search)
				{
					System.out.println("Element on "+ mi+" position");
					break;
				}
				else if(a[mi]<search)
				{
					li=mi+1;
				}
				else if(a[mi]>search)
				{
					hi=mi-1;
				}
				
				mi=(li+hi)/2;
			}
			
	    	if(li>hi)
				System.out.println("Element not found in the list");
			

		}
		
	}

