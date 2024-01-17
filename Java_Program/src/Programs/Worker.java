package Programs;

class Worker 
{
	int id;
	String name;
	
	public void insert_record(int id, String name)
	{	
		this.id = id;
		this.name = name;
	}
	
	public void display_record()
	{
		System.out.println(id+ " "+name);
	}

}
class Test
{
	public static void main(String[] args) 
	{
		Worker w = new Worker();
		
		w.insert_record(101,"Mohan");
		w.display_record();
	}
}
