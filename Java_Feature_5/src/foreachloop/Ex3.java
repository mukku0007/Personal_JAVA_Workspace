package foreachloop;

import java.util.ArrayList;
import java.util.List;

public class Ex3 
{
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Mukesh");
		list.add("Rakesh");
		list.add("Om Prakash");
		list.add("Aman");
		
		for(String name:list)
		{
			System.out.println(name);
		}
	}
}
