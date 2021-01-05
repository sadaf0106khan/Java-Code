import java.util.*;

public class WordReverseInString 
{
	

	public static void main(String[] args) 
	{
		//this is for the reverse the string with no spaces
//		  Scanner sc=new Scanner(System.in); 
//		  System.out.println("Enter String");
//		  String str=sc.nextLine();
//		  
//		  int len=str.length(); 
//		  String str2=""; 
//		  for(int i=len-1;i>=0;i--)
//		  {
//		      if(str.charAt(i)!=' ') //this line removing for space
//			  System.out.print(str.charAt(i)); 
//		  }
		  
	// }
		 
		// program reverse string space having same place
		
//		  Scanner sc=new Scanner(System.in); 
//		  System.out.println("Enter new String");
//		  String str=sc.nextLine(); 
//		  int len=str.length(); 
//		  String str2="";
//		  String str3=""; 
//		  for(int i=len-1;i>=0;i--) 
//		  {
//		  
//		  if(str.charAt(i)!=' ') 
//			  // System.out.print(str.charAt(i));
//		     str2=str2+str.charAt(i);
//		  
//		  } 
//		  int j=0; 
//		  for(int i=0;i<=len-1;i++)
//		  { 
//			  if(str.charAt(i)==' ') 
//			 { 
//				  str3=str3+' ';
//			 } 
//			  else 
//			  { 
//				  str3+=str2.charAt(j);
//				  j++; 
//				 
//			  }
//			  } 
//		  System.out.println(str3);
		  
		 
		        String s = "i like this program very much"; 
		        String ans = ""; 
		        for (int i = s.length() - 1; i >= 0; i--)
		        { 
		            ans += s.charAt(i); 
		        } 
		        System.out.println("Reversed String:"); 
		        System.out.println(ans); 
	}
}