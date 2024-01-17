package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_All_Data_From_Table 
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
			
			String q = "Select * from demo";
			
			Statement stmt = con.createStatement();
		
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				
				System.out.println(id+" "+name);
			}
			
		}
		catch(Exception e)
		{
			
		}
	}
}
