package interviewquestions;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int a[]= {44,5,4,3,5,6,57,-9,-89,-766},temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0&&a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}
