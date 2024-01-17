package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_Map {

	public static void main(String[] args) {
		
		List<Map<String, String>> myList = new ArrayList<Map<String, String>>();
		Map<String, String> myMap = new HashMap<String, String>();
		// populate
		for (int i = 0; i < 3; i++) {
		    myMap.put("key", "val+" + i);
		    myList.add(myMap);
		}
		// retrieve
		for (int i = 0; i < myList.size(); i++) {
		    System.out.println("my value is: "+myList.get(i).get("myKey"));
		}
	}
}
