package String_Methods;

public class Str_Start_With_End_With 
{
	public static void main(String[] args) 
	{
		String s = "Mukesh";
		
		System.out.println(s.startsWith("Mu"));
		System.out.println(s.startsWith("Ku"));
		
		//The method startsWith() checks whether the String starts with the letters passed as arguments It returns true or false. 
		
		System.out.println("==================================================================");
		
		System.out.println(s.endsWith("sh"));
		System.out.println(s.endsWith("es"));
		
		// The method endsWith() method checks whether the String ends with the letters passed as arguments It returns true or false .
	}
}
