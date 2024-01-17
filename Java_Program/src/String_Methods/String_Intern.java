package String_Methods;

public class String_Intern 
{
	public static void main(String[] args) 
	{
		String s = "Mukesh";
		
		String s1 = new String("Mukesh");
		String ss = s1.intern();
		
		System.out.println(s);
		System.out.println(ss);
	}
}
