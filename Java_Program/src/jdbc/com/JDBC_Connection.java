package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connection 
{
	public static void main(String args[])
	{	
		try
		{
			//Here we load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			//Here we create a Connection
			String url = "jdbc:mysql://localhost:3306/demo";
			String username="root";
			String password="Mukesh@7250";
			
			Connection con = DriverManager.getConnection(url,username,password); 
		        if(con.isClosed())
		        {
		           System.out.println("Connection is Closed");
		        }
		        else
		        {
		           System.out.println("Connection is Created");
		        }		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
     }

}
