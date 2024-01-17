package String_Buffer_Method;

public class Insert 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("RJ");
		
		// The insert() method inserts the given String with this string at the given position.
		sb.insert(1, "A");
		
		System.out.println(sb);
	}
}
