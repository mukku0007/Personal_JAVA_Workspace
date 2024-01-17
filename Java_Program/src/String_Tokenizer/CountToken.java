package String_Tokenizer;

import java.util.StringTokenizer;

public class CountToken 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Happy Coding");
		
		System.out.println("Total Number of Token are: "+st.countTokens());
	}
}
