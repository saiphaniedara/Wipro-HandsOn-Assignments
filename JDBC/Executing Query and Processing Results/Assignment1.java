import java.sql.*;
public class Assignment1 {

	public static void main(String[] args) throws Exception {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1","hr","hr");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select employee_id,first_name from employees");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("first_name"));
			}
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Connection could not be established");
		}

	}

}
