package OOP;

public class Student {

	int id;
	String name;
	
	public void insert(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("Id: "+id + "Name: "+name );
	}
	
	public static void main(String[] args) {
		
		Student one = new Student();
		Student two = one;
		two.id=101;
		one.name="Mukeshk";
		
		two.display();
		
	}	
}