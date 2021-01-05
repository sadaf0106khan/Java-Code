import java.util.*;
public class ListInCollection
{
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		l.add(0);
		l.add(2);
		l.add(3);
		l.add(9);
		l.add(19);
		l.add(13);
		l.add(4);
		l.add(5);
		//l.add("a");//in list we dont add another type of object
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		//l.clear();
		//System.out.println(l);
		int b=l.size();
		System.out.println(b);
		Collections.sort(l);
		l.remove(4);
		l.add(0,5);//add a partcular location
		
		System.out.println(l);
		 Collections.reverse(l);//for reverse l arraylist
		System.out.println(l);
	int t=l.indexOf(2);
System.out.println(t);
		boolean s=l.contains(19);
		System.out.println(s);
		
	}
}
