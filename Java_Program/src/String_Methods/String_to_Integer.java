package String_Methods;

public class String_to_Integer 
{
	public static void main(String[] args) 
	{
		String s = "123";
		//String s = "abc"; 					// java.lang.NumberFormatException: For input string: "abc"
		int num = Integer.parseInt(s);
		System.out.println(num);
	}
}
