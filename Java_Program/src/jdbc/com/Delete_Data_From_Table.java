package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_Data_From_Table 
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
			
			String 	q = "delete from demo where id=103";
			
			PreparedStatement pstmt = conn.prepareStatement(q);
			pstmt.executeUpdate();
			
			System.out.println("Data Deleted Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
