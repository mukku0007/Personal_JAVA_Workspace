package String_Methods;

public class String_Replace 
{
	public static void main(String[] args) 
	{
		String s = "Kava is a Programming Language.Kava is Platfrom Independent";
		
		// The String class, replace() method replaces all occurrence of first sequence of character with second sequence of character.
		String replace_string = s.replace("Kava", "Java");
		
		System.out.println(s);
		System.out.println("=============================================================");
		System.out.println(replace_string);
	}
}
