package type_inference_for_generic_instance;

import java.util.ArrayList;
import java.util.List;

/*

TypeInference:- 
In Java 7, Java provides improved compiler which is enough smart to infer the type of generic instance. 
Now, you can replace the type arguments with an empty set of type parameters (<>). 
This pair of angle brackets is informally called the diamond.

The following approach is used in Java 6 and prior version.

Example:-
List<Integer> list  = new List<Integer>();  

Now, you can use the following new approach introduced in Java 7.

Example:- 
List<Integer> list = new List<>(); // Here, we just used diamond


Type Inference and Generic Constructors:-
You can create generic constructor in both generic and non-generic classes. 

See in the Example 1, we have created a generic type constructor.  
	
*/

public class Type_Inference_Demo 
{
	public static void main(String[] args) 
	{
		// In Java 6 and earlier    
        List<Integer> list = new ArrayList<Integer>();  
        list.add(12);  
        for (Integer element : list) 
        {  
            System.out.println(element);  
        } 
        
        // In Java 7  
        List<Integer> list2 = new ArrayList<>(); // Here, diamond is used   
        list2.add(12);  
        for (Integer element : list2) 
        {  
            System.out.println(element);  
        }  
    }  
}
