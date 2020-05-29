import java.sql.*;
public class MakeConnection {
	public Connection connect() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1","hr","hr");
		return con;
	}
}
