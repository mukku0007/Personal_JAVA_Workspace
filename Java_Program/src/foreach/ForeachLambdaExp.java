package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForeachLambdaExp 
{
	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		
		//Here we use ForEach Lambda Expression
		l.forEach(
				(n)-> System.out.println(n)
				);
	} 
}
