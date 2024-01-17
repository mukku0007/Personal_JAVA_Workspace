package Stream_API;

import java.util.*;
import java.util.stream.*;

class Stream_Demo
{
	public static void main(String args[])
	{
		
	//Create a list of integers	
	List<Integer> number = Arrays.asList(2,3,4,5);
	//Demonstration of map method
	List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
	System.out.println(square);
	
	System.out.println("=============================================");
	
	//Create a list of String
	List<String> names = Arrays.asList("Mukesh","Rakesh","Rana");

	//Demonstration of filter method
	List<String> result = names.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
	System.out.println(result);
	System.out.println("=============================================");
	
	//Demonstration of sorted method
	List<String> show = names.stream().sorted().collect(Collectors.toList());
	System.out.println(show);
	System.out.println("=============================================");
	
	
	//Create a list of integers
	List<Integer> numbers = Arrays.asList(2,3,4,5,2);

	//Collect method returns a set
	Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
	System.out.println(squareSet);
	System.out.println("=============================================");
	
	
	//Demonstration of forEach method
	number.stream().map(x->x*x).forEach(y->System.out.println(y));
	System.out.println("=============================================");
	
	//Demonstration of reduce method
	int even =
	number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	System.out.println(even);
	
	}
}
