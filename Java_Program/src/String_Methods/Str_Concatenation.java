package String_Methods;

public class Str_Concatenation 
{
	public static void main(String[] args) 
	{
		String s1 = "Mukesh";
		String s2 = "Kumar";
		System.out.println(s1 + s2);
		
		System.out.println("===============================================================");
		
		String s = "Mukesh" + "Raj";
		System.out.println(s);
		
		System.out.println("===============================================================");
		
		String str1 = 10+40+"Mukesh"+20+10;
		System.out.println(str1);  				
		
		//After a string literal, all the + will be treated as string concatenation operator.
		
		System.out.println("===============================================================");
		
		String s3 = "Rana";
		String s4 = "Omanshu";
		String s5 = s3.concat(s4);
		
		System.out.println(s5);
		
		System.out.println("===============================================================");
		
		StringBuilder ss1 = new StringBuilder("Hello");
		StringBuilder ss2 = new StringBuilder("World");
		
		StringBuilder ss3 = ss1.append(ss2);
		System.out.println(ss3);
		System.out.println(ss3.toString());
		
		System.out.println("===============================================================");
		
		String s6 = String.join("",s3,s4);
		System.out.println(s6);
	}
}
