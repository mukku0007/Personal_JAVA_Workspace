package Map_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Demo_2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer,String>();
		m.put(101,"Mukesh Kumar");
		m.put(102, "Rakesh Kumar");
		m.put(103, "Om Prakash");
		m.put(104, "Rana Gautam");
		
		System.out.println(m); //{101=Mukesh Kumar, 102=Rakesh Kumar, 103=Om Prakash, 104=Rana Gautam}
		
		
		// Returns all the keys as Set, 
		for(Object i : m.keySet())
		{
			System.out.println(i);
		}
		
		
		// Returns all the Values as Collection.
		for(Object i : m.values())
		{
			System.out.println(i);
		}
		
		//Returns Key and Value Pairs
		for(Object i : m.keySet())
		{
			System.out.println(i+"       "+m.get(i));
		}
		
		System.out.println("=============================================================");
		
		//Iterator
		Set s = m.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+"        "+entry.getValue());
		}
		
		
	}
}
