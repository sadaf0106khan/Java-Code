package MultiDimentionalArray;
import java.util.*;
public class MirrorImageOfMatrix 
{
	
			public static void main(String[] args)
			{
			   
				Scanner sc=new Scanner(System.in);
			    System.out.println("Enter a no of nxn matrix");
			    int n=sc.nextInt();
			    int a[][]=new int[n][n];
			    System.out.println("Enter a matrix");
			    for(int i=0;i<n;i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		a[i][j]=sc.nextInt();
			    	}
			    }
			    //for tranpose matrix
			    for(int i=0;i<n;i++)
			    {
			    	for(int j=i;j<n;j++)
			    	{
			    		int temp=a[i][j];
			    		a[i][j]=a[j][i];
			    		a[j][i]=temp;
			    	}
			    }
			    //for 90degree rotation
			    

			    for(int i=0;i<n;i++)
			    {
			    	for(int j=0;j<n/2;j++)
			    	{
			    		int temp=a[i][j];
			    		a[i][j]=a[i][n-j-1];
			    		a[i][n-j-1]=temp;
			    	}
			    }

			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    for(int i=0;i<n;i++)
			    {
			    	for(int j=0;j<n;j++)
			    	{
			    		System.out.print(a[i][j]);
			    	}
			    	System.out.println();
			    }
			}
	
}
