
public class MatrixAdditionWithRandomElement 
{
	public static void main(String[] args)
	{
	int [][] a=new int[3][3];
	int [][] b=new int[3][3];
	int [][] c=new int[3][3];
	
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]= (int)((Math.random()*10));
			b[i][j]= (int)((Math.random()*10));
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+" \t");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[i][j]+" \t");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[i][j]+" \t");
		}
		System.out.println();
	}
	
	
	
	
	}
	
}

