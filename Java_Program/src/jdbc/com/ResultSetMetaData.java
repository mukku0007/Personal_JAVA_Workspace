package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultSetMetaData 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/employee";
			String username = "root";
			String password = "Mukesh@7250";
			
			Connection conn = DriverManager.getConnection(url,username,password);
			
			String q = "select * from emp";
			
			PreparedStatement pstmt = conn.prepareStatement(q);
			
			ResultSet rs = pstmt.executeQuery();
			
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Total Columns: " +rsmd.getColumnCount());
			
			System.out.println("Column Name of 1st Column: "+rsmd.getColumnName(1));
			System.out.println("Column Name of 2nd Column: "+rsmd.getColumnName(2));
			System.out.println("Column Name of 3rd Column: "+rsmd.getColumnName(3));
			System.out.println("Column Name of 4th Column: "+rsmd.getColumnName(4));
			
			System.out.println("Column Type Name of 1st Column: "+rsmd.getColumnTypeName(1));
			System.out.println("Column Type Name of 2nd Column: "+rsmd.getColumnTypeName(2));
			System.out.println("Column Type Name of 3rd Column: "+rsmd.getColumnTypeName(3));
			System.out.println("Column Type Name of 4th Column: "+rsmd.getColumnTypeName(4));
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
