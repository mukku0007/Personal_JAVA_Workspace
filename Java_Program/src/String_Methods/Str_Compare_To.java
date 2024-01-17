package String_Methods;

public class Str_Compare_To 
{
	public static void main(String[] args) 
	{
		String st1 = "apple";  	// Here UniCode of a is 97
		String st2 = "ball";  	// Here UniCode of b is 98
		String st3 = "apple";
		String st4 = "car";
		
		// If st1 < st2 Result - Negative Value
		// If st1 > st2 Result - Positive Value
		// If st1 = st2 Result - 0 
		
		System.out.println(st1.compareTo(st2)); 	// It Print Negative Number
		System.out.println(st4.compareTo(st1));		// It Print Positive Number
		System.out.println(st1.compareTo(st3)); 	// It Print 0
	}
}

/*
CompareTo Method works on UniCode Ranges :- 

	UniCode Range 			Character Range
 	48 - 57						0 - 9
 	65 - 90						A - Z
 	97 - 122					a - z
*/
