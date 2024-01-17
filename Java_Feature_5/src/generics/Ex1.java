package generics;

import java.util.ArrayList;
import java.util.List;

public class Ex1 
{
	public static void main(String[] args) 
	{
		//Here <String> is a Generic Type. Only String type of list add.
		List<String> list = new ArrayList<>(); 
		list.add("Mukesh");
		//list.add(10);  		It accept only String not Integer 
		
		
		//Here <Integer> is a Generic Type. Only Integer type of list add.
		List<Integer> list2 = new ArrayList<>(); 
		list2.add(161);
		//list2.add("Rakesh");  It accept only Integer not String 
		
		
		// Here it is non Generic Type. we add all type of data.
		List anotherList = new ArrayList(); 
		anotherList.add("Mukesh");
		anotherList.add(161);
		anotherList.add(12.12);
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println(anotherList);
	}
}
