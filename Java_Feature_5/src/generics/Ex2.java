package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 
{
	public static void main(String args[])
	{  
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Mukesh");  
		list.add("Kumar");  
		//list.add(32);  //compile time error  
		  
		String s=list.get(0);  //type casting is not required  
		System.out.println("Element is: "+s);  
		  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
	}  
}
