import java.sql.*;
public class Assignment2 {

	public static void main(String[] args) throws Exception {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1","hr","hr");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select first_name || ' ' || last_name as ename,job_id,salary,commission_pct from employees where salary>1000 and salary<2000");
			if(rs.next())
			{
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getDouble(4));
			}
			}
			else
			{
				System.out.println("No records Found");
			}
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Connection could not be established");
		}
	}

}
