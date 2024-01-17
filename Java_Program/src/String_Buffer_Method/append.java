package String_Buffer_Method;

/*

What is a mutable String?
A String that can be modified or changed is known as mutable String. 
StringBuffer and StringBuilder classes are used for creating mutable strings. 

*/

public class append 
{
	 public static void main(String[] args) 
	 {
		 StringBuffer sb = new StringBuffer("Hello");
		 
		 // The append() method concatenates the given argument with this String.
		 sb.append("Mukesh");
		 
		 System.out.println(sb);
	 }
}
