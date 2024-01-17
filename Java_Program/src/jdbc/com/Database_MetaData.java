package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database_MetaData 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/demo";
			String username = "root";
			String password = "Mukesh@7250";
			
			Connection conn = DriverManager.getConnection(url,username,password);
			
			java.sql.DatabaseMetaData  dbmd = conn.getMetaData();
			
			System.out.println("DriverName: "+dbmd.getDriverName());
			System.out.println("DriverVersion: "+dbmd.getDriverVersion());
			
			System.out.println("URL: "+dbmd.getURL());
			System.out.println("Username: "+dbmd.getUserName());
			
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
