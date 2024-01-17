package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class New {

	public static void main(String args[])
	{
	List<Integer> number = Arrays.asList(2,3,4,5);
	Stream<Integer> s = number.stream();
	List<Integer> square =  s.map(x -> x*x).collect(Collectors.toList());
	//s.forEach(n -> System.out.println(n));
	
	System.out.println(square);
	}
}
