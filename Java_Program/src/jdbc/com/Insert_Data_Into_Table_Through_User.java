package jdbc.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//Here Insert the Data into the Table using PreparedStatement through User Input

public class Insert_Data_Into_Table_Through_User 
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
			String q = "insert into demo(name) values(?)";
			
			// Here Get the Object of Prepared Statement 
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// Here Get the Input from Users
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			//System.out.println("Enter Id");
			//int id = br.read();
			// Here we not use Id Because we already use id is not Null auto_increment
			
			
			System.out.println("Enter Name");
			String name = br.readLine();
			
			// Here Set the Value to Query
			//pstmt.setInt(1,id);			// Here we set the ID
			pstmt.setString(1,name);  		// Here we Set the Name
			
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
