package interviewquestions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
//bruetforce method 
import java.util.Scanner;
import java.util.Set;

public class ReapetedWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str1=sc.nextLine();
		String [] str=str1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println(str[j]);
				}
				
					
			}
		}
		
		System.out.println("*****************");
		//has set method
		Set<String> word=new HashSet<String>();
		{
			for(String words:str)
			{
				if(word.add(words)==false)
				{
					System.out.println(words);
				}
			}
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxx");
		Map<String,Integer> store=new HashMap<String,Integer>();
			
			for(String s:str)
			{
				Integer count=store.get(s);
				if(count==null)
				{
					store.put(s,1);
				}
				else
				{
					count+=1;
				store.put(s,count);
				}
			}
		Set<Map.Entry<String,Integer>> map=store.entrySet();
		for(Map.Entry<String,Integer> m: map)
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+m.getValue());
			}
		}
		
		
		
		
		
	}
}
