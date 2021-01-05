import java.util.*;
public class ConvertNumberIntoBinary 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
			int binary[]=new int[20];
			int index=0;
			while(num>0)
			{
			binary[index]=num%2;
			index++;
			num=num/2;
			}
			for(int i=binary.length-1;i>=0;i--)
			{
				System.out.print(binary[i]);
			}
		//using stack;
//			Stack<Integer> s=new Stack<>();
//			while(num>0)
//			{
//				int d=num%2;
//				s.push(d);
//				num=num/2;
//				
//			}
//			while(!(s.isEmpty()))
//			{
//				System.out.print(s.pop());
//			}
//			//using inbuildfunction
////			String str=Integer.toBinaryString(num);
////			System.out.print(str);
		}
	
}
