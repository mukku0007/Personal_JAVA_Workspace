package Programs;
import java.util.Scanner;

public class Int_to_String
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    in.close();
	    // String s=???; Complete this line below
	        
	    String s = Integer.toString(n);
	    if (n == Integer.parseInt(s)) 
	    {
	       System.out.println("Good job");
	    } 
	    
	    else 
	    {
	       System.out.println("Wrong answer.");
	    }
	 }
}

