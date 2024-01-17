package jdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// Here Insert the Data into the Table using PreparedStatement

public class Insert_Data_Into_Table 
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
			
			// Here Create Query Which is Dynamic or Parameterized Query
			String q = "insert into demo(id,name) values(?,?)";
			
			// Here Get the Object of Prepared Statement 
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// Here Set the Value to Query
			pstmt.setInt(1,102);				 // Here we set the ID
			pstmt.setString(2,"Rakesh Kumar");  // Here we Set the Name
			
			// Here Execute the query and Save in the table 
			pstmt.executeUpdate();
			
			// Here Print the Message on the Console
			System.out.println("Record Inserted Successfully");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
