package Programs;

public class Employee 
{
	int id;
	String name;
	
	public void insert(int id, String name)
	{	
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(id+ " "+name);
	}
	
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.id=101;
		e.name="Mukesh Kumar";
		e.display();
		
		Employee e1 = new Employee();
		e1.id = 102;
		e1.name = "Rakesh Kumar";
		e1.display();
		
	}
}
