package assertion;

import java.util.Scanner;  
    
class AssertionExample{  
 public static void main( String args[] ){  
  
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter your age ");  
    
  int age = scanner.nextInt();  
  assert age>=18: "Not valid";  
  
  System.out.println("Your Age is "+age);  
 }   
}  