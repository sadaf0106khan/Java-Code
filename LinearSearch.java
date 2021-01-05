
public class LinearSearch
{
	public static void main(String[] args)
	{
		int a[]= {2,3,4,3,2,5,6,4,3,8,7,87,9,77,56,5,54,4};
		int item=3;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("item is present on "+i+"th"+" position in the list");
				temp++;
			}
		}
		if(temp==0)
			System.out.println("item is not in the array list");
	}
}
