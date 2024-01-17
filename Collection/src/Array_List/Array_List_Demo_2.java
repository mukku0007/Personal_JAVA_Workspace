package Array_List;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_List_Demo_2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println(al); // [A, B, C, D]
		
		ArrayList al2 = new ArrayList();
		
		//addAll() - add all ArrayList
		al2.addAll(al);
		al2.add("X");
		al2.add("Y");
		al2.add("Z");
		
		System.out.println("After Adding: "+al2); // [A, B, C, D, X, Y, Z]
		
		//removeAll() - remove all ArrayList
		al2.removeAll(al);
		System.out.println("After Removing: "+al2);
		
		al2.removeAll(al2);
		System.out.println("After Removing: "+al2);
		
		ArrayList al3 = new ArrayList();
		al3.add("X");
		al3.add("Y");
		al3.add("Z");
		al3.add("A");
		al3.add("B");
		al3.add("C");
		
		// Collections.sort() - sort() elements in arrayList
		System.out.println("Elements in the ArrayList :"+al3); //[X, Y, Z, A, B, C]
		Collections.sort(al3);
		System.out.println("Elements in the ArrayList after Sorting: "+al3); //[A, B, C, X, Y, Z]
		
		// sort arrayList in reverse order.
		Collections.sort(al3, Collections.reverseOrder());
		System.out.println("Elements in the ArrayList after sorting in reverse order: "+al3); //[Z, Y, X, C, B, A]
		
		// Collections.suffle() - Suffling elements in arrayList
		Collections.shuffle(al3);
		System.out.println("Elements in the ArrayList after suffling: "+al3); //[A, Z, B, C, X, Y]
		
		
		
		
	}
}
