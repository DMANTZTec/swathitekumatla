package sqlConnection;
import java.sql.*;
public class Students_Data {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","Swathi@27");
			Statement stmt=con.createStatement();
			String table = "Select *from users"; 
			ResultSet rs=stmt.executeQuery(table);
			while(rs.next())
			System.out.println(rs.getInt(1)+" ,"+rs.getString(2)+" ,"+rs.getString(3)+" ,"+rs.getString(4)+" ,"+rs.getString(5)+" ,"+rs.getInt(6));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
