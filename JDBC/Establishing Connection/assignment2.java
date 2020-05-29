import java.sql.*;
public class assignment2 {

	public static void main(String[] args) {
		try
		{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1","hr","hr");
			System.out.println("Connection Established Successfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Connection could not be established");
			System.out.println(e);
		}

	}

}
