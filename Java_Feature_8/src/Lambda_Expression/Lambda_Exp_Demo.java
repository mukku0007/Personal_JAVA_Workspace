package Lambda_Expression;

public class Lambda_Exp_Demo {

	/*
	Functional Interface:- It is an interface which have only one abstract method (single abstract method) 
	is called functional interface.
	
	
	Lambda_Exp:- 
	The Lambda expression is used to provide the implementation of an interface which has functional interface. 
	Lambda Expression is an anonymous function which is called as a Nameless Function. 
	Thats function doesn't have a Name, Return type an
	It saves a lot of code. 
	But you can have any number of Default Method and Static Method.
	
	
	Syntax:- (argument-list) -> {body}  
	
	
	Java lambda expression is consisted of three components.-
	1) Argument-list: It can be empty or non-empty as well.
	2) Arrow-token: It is used to link arguments-list and body of expression.
	3) Body: It contains expressions and statements for lambda expression.
	
	
	No Parameter Syntax:-
	() -> {  
	//Body of no parameter lambda  
	}
	  
	One Parameter Syntax:-
	(p1) -> {  
	//Body of single parameter lambda  
	}
	  
	Two Parameter Syntax:-
	(p1,p2) -> {  
	//Body of multiple parameter lambda  
	}  
	
	
	Valid Lambda Expression:-
	n -> {return n*n;};
	n -> n*n;
	
	Invalid Lambda Expression:-
	n -> return n*n;
	n -> {return n*n;};
	n -> {n*n;};


	
	*/
}
