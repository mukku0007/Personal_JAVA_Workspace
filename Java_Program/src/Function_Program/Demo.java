package Function_Program;

class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
}

public class Demo {
	public static void main(String[] args) {
		
		//int num1 = 5;
		//int num2 = 10;
		
		Calculator calc = new Calculator();
		//int result = calc.add(num1, num2);
		int result = calc.add(5, 5);
		System.out.println(result);
	}
}
