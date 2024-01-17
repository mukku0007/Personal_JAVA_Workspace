package String_Methods;

public class SubString 
{
	public static void main(String[] args) {
		
		String str = "Mukesh";
		String str1 = str.substring(1, 5);	
		System.out.println(str1);
		
		System.out.println("=========================================================");
		
		String str2 = "Kumar";
		String str3 = "Raj";
		
		String output = str.concat(" "+str2 + str3);
		System.out.println(output);
		
		System.out.println("=========================================================");
		
		System.out.println(str.length());
		
		System.out.println("=========================================================");
		
		System.out.println(str.indexOf("h"));
		
		System.out.println("=========================================================");
		
		System.out.println(str.toUpperCase());
		
		System.out.println("=========================================================");
		
		String s1 = "Mukesh";
		String s2 = "Mukesh";
		
		String s3 = new String("Mukesh");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println("=========================================================");
		
		String ss1 = "mukesh";
		String ss2 = "Mukesh";
		String ss3 = "mukesh";
		
		System.out.println(ss1.equals(ss2));
		System.out.println(ss1.equals(ss3));
		
		System.out.println("=========================================================");
	}
}
