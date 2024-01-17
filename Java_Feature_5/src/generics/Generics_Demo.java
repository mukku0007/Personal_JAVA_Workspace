package generics;

/*
Generic:-
It makes the code stable by detecting the bugs at compile time.

Before generic, we can store any type of objects in the collection, i.e., non-generic.

Now generic force the java programmer to store a specific type of objects.

	
Advantage of Java Generic:-
There are mainly 3 advantages of generic. 

1) Type-safety: 
				We can hold only a single type of objects in generic. 
				It doesn't allow to store other objects.

Example:-

Without Generic, we can store any type of objects.
List list = new ArrayList();    
list.add(10);  
list.add("10");
  
With Generic, it is required to specify the type of object we need to store.  
List<Integer> list = new ArrayList<Integer>();    
list.add(10);  
list.add("10");  //Compile-time error


2) Type casting is not required: 
								  There is no need to type-cast the object.

Example:-

Before Generic, we need to type cast.
List list = new ArrayList();    
list.add("hello");    
String s = (String) list.get(0);//type-casting

    
After Generic, we don't need to type-cast the object.  
List<String> list = new ArrayList<String>();    
list.add("hello");    
String s = list.get(0);


3) Compile-Time Checking: 
						   It is checked at compile time so problem will not occur at runtime. 
						   The good programming strategy says it is far better to handle the problem at compile time than runtime.
						   

Example:-
List<String> list = new ArrayList<String>();    
list.add("hello");    
list.add(32);//Compile Time Error  


Syntax to use generic collection:-
Class Or Interface<Type>
    
Example to use Generic in java:-
ArrayList<String>

    
Generic in Java:-
We are using the ArrayList class, but you can use any collection class 
such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.
See example in Ex2.


Generic using Map:-
Use map elements using generic. 
Here, we need to pass key and value.
See example in Ex3.


Generic class:-
A class that can refer to any type is known as a generic class. 
Here, we are using the T type parameter to create the generic class of specific type.

Creating a generic class:-
class MyGen<T>
{  
	T obj;  
	void add(T obj)
	{
		this.obj=obj;
	}  
	T get()
	{
		return obj;
	}  
} 
 
The T type indicates that it can refer to any type (like String, Integer, and Employee). 
The type you specify for the class will be used to store and retrieve the data.

Type Parameters:-
The type parameters naming conventions are important to learn generic thoroughly. 
The common type parameters are as follows:

T - Type
E - Element
K - Key
N - Number
V - Value


Generic Method:-
Like generic class, we can create a generic method that can accept any type of arguments. 
Here, the scope of arguments is limited to the method where it is declared. 
It allows static as well as non-static methods.

See Example Ex4.



  						        					
*/

public class Generics_Demo {

}
