package jdbc.com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Image_Into_Table 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url 		= "jdbc:mysql://localhost:3306/demo";
			String username = "root";
			String password = "Mukesh@7250";
			
			Connection con = DriverManager.getConnection(url, username,password);
			
			String q = "insert into image(pic) values(?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			
			// Here we upload the File from System
			FileInputStream fis = new FileInputStream("D:\\PERSONAL JAVA WORKSPACE\\Java_Program\\src\\jdbc\\2.png");
			
			pstmt.setBinaryStream(1, fis,fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("Images Uploaded Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
