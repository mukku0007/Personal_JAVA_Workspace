package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_Table 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/demo";
			String username = "root";
			String password = "Mukesh@7250";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			// Here write Create Table Query
			
			String q = "Create table demo (id int(20) primary key auto_increment, name varchar(200))";
			
			// Here Create Statement 
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q); 
			System.out.println("Demo Name Table Created Successfully in the Database");
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
