package String_Tokenizer;

import java.util.StringTokenizer;

public class nextToken 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Hello World");
		
		System.out.println("Next Token is: "+st.nextToken());
	}
}
