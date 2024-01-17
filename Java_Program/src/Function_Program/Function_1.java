package Function_Program;

import java.util.Scanner;

public class Function_1 {
    
    public static String hello(String name)
    {
        return name;
    }
    
    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your Name Here:-");
    	String name = sc.next();
    	
        String print = hello(name);
        
        System.out.println("You Entered Name is: "+print);
    }
}