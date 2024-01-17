package aggregation.com;

// If a class have an entity reference, it is known as Aggregation. 
// Aggregation represents HAS-A relationship.

public class Employee
{
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String args[])
	{
		Address address1 = new Address("Rafiganj","Bihar","India");
		
		Employee e = new Employee(101,"Mukesh Kumar",address1);
		
		e.display();
	}
	
}
