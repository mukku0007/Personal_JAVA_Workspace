package Map_HashMap;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		//Declare 
		
		HashMap m = new HashMap();
		//HashMap<Integer, String> m = new HashMap<Integer,String>();
		m.put(101,"Mukesh Kumar");
		m.put(104, "Rana Gautam");
		m.put(102, "Rakesh Kumar");
		m.put(101, "Aman Kumar"); // Here Duplicate are not allowed
		System.out.println(m);       //{101=Mukesh Kumar, 102=Rakesh Kumar}
		
		System.out.println(m.get(101)); //Aman Kumar
		
		System.out.println(m.remove(101));
		
		System.out.println(m.containsKey(102)); //true
		
		System.out.println(m.containsKey(101)); //false
		
		System.out.println(m.containsValue("Rakesh Kumar")); //true
		 
		System.out.println(m.containsValue("Mukesh Kumar")); //false
		
		System.out.println(m.isEmpty()); //false
		
		System.out.println(m.keySet()); //[102, 104] it returns all the key as set.
		
		System.out.println(m.values()); //[Rakesh Kumar, Rana Gautam] it returns all the values as Collection.
 
		System.out.println(m.entrySet()); //[102=Rakesh Kumar, 104=Rana Gautam], It returns all the entries as Set Object. 
		
		
	}
}
