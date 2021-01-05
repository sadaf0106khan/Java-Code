import java.util.Scanner;

//Smallest number using terneary operator;
public class SmallestNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		System.out.println("Enter Third number");
		int num3=sc.nextInt();
		int Smallest=(num1<=num2 ?(num1<=num3 ? num1 : num3) : (num2<num3 ? num2 : num3));
		System.out.println("Smallest number is "+Smallest);
		sc.close();
	}

}
