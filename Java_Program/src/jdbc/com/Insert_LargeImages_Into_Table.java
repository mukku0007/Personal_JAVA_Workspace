package jdbc.com;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;

public class Insert_LargeImages_Into_Table 
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
			
			String q = "insert into images(pic) values(?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// Here Open a Console where we choose the File which we want to store
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			
			pstmt.setBinaryStream(1,fis,fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("Images Uploaded Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
