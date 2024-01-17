package Array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Demo {
	
	public static void main(String[] args) {
		
		// ArrayList is major used for retrieving on the more no of elements.
		
		//Declare ArrayList
		
		//ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList<String> al2 = new ArrayList<String>();
		//List al3 = new ArrayList();
		ArrayList al4 = new ArrayList();
		
		
		// Add new Elements to the ArrayList
		
		al4.add(100);
		al4.add("Welcome");
		al4.add(15.5);
		al4.add('A');
		al4.add(true);
		
		System.out.println(al4);  //[100, Welcome, 15.5, A, true]
		
		// Size
		System.out.println("Number of Elements in the ArrayList: " +al4.size());
		
		// Remove
		al4.remove(1); // Here 1 is Index
		al4.remove("Welcome"); // Here Welcome is Element
		
		System.out.println("After Removing Elements from array list: "+al4);  //[100, 15.5, A, true]
		
		// Insert a new Element 
		//add(index, object)
		al4.add(2,"Python");
		System.out.println("After Insertion: "+al4); // [100, 15.5, Python, A, true]
		
		// Retrieve Specific Elements
		System.out.println(al4.get(2)); //Python, Here 2 is index of elements / object.
		
		// Change elements / replace
		al4.set(2, "Java");
		System.out.println("After Replacing Elements: "+al4); //[100, 15.5, Java, A, true]
		
		// Search - contains() - Returns true / false.
		System.out.println(al4.contains("C#"));    //false
		System.out.println(al4.contains("Java")); //true
		
		// isEmpty() - It checks our ArrayList is empty or not, it returns true or false
		System.out.println(al4.isEmpty()); //false
		
		
		// How the read / fetch data elements from ArrayList in different ways.
		// We have 3 Approach
		
		// 1. Using for loop
		
		System.out.println("================================================================");
		
		System.out.println("Reading Elements using for Loop");
		
		for(int i=0; i<al4.size(); i++)
		{
			System.out.println(al4.get(i));
		}
		
		System.out.println("================================================================");
		
		// 2. Using for-each loop
		
		System.out.println("Reading Elements using for-each loop");
		
		for(Object e : al4) // Here we use "object" return type because object hold all types of data.
		{
			System.out.println(e);
		}
		
		System.out.println("================================================================");
		
		// 3. Using Iterator() method.
		// Here Iterator is an Interface and it is parent interface of collection.
		System.out.println("Reading Elements using Iterator() Method");
		
		Iterator it = al4.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("================================================================");
	}

}
