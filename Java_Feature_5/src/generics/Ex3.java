package generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex3 
{
	public static void main(String[] args) 
	{
			Map<Integer,String> map=new HashMap<Integer,String>();  
			map.put(1,"Mukesh");  
			map.put(2,"Rakesh");  
			map.put(3,"Saurabh");  
			  
			//Now use map.Entry for Set and Iterator  
			Set<Map.Entry<Integer,String>> set=map.entrySet();  
			  
			Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
			while(itr.hasNext())
			{  
				Map.Entry e=itr.next();		//No Need to Type-cast  
				System.out.println(e.getKey()+" "+e.getValue());  
			}  
	}
}
