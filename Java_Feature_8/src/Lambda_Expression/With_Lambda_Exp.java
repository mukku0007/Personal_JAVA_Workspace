package Lambda_Expression;

public interface With_Lambda_Exp {

	public static void main(String[] args) {
		
		int age = 20;
		String name = "Mukesh";
		
		Print obj2 = () -> {
			
			System.out.println("Name is: " + name + " and their age: "+age);
			
		};
		obj2.show();
	}
}
