package Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_Demo_3 {

	public static void main(String[] args) {
		
		String arr[] = {"Dog", "Cat","Monkey"};
		for(String value : arr)
		{
			System.out.println(value);
		}
		
		System.out.println("==============================================================");
		
		// How to Convert Array into ArrayList
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
		
	}
}
