package jdbc.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_Data_Into_Table 
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
			
			String q = "update demo set name=? where id=?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Name:");
			String name = br.readLine();
			
			System.out.println("Enter Id");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt = conn.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			
			pstmt.executeUpdate();
			
			
			System.out.println("Record Updated Successfully");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
