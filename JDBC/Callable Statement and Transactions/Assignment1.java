import java.sql.*;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try
		{
		con=new MakeConnection().connect();
		CallableStatement cstmt=con.prepareCall("{call calculate_net_sal(?,?)}");
		cstmt.registerOutParameter(2, Types.DECIMAL);
		System.out.println("Enter employee id: ");
		int empid=sc.nextInt();
		cstmt.setInt(1, empid);
		cstmt.execute();
		double net_sal=cstmt.getDouble(2);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select first_name from employees where employee_id="+empid);
		rs.next();
		System.out.println(empid+" "+rs.getString(1)+" "+net_sal);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}

	}

}
