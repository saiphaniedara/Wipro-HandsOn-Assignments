import java.sql.*;
public class DAOClass {
	Connection con;
	PreparedStatement stmt;
	public DAOClass()
	{
		try
		{
			con=new MakeConnection().connect();
		}
		catch(Exception e)
		{
			System.out.println("Connection can't be established");
		}
	}
	public void insert(int id,String name,String s,String date,double fee) throws Exception{
		stmt=con.prepareStatement("insert into student values(?,?,?,?,?)");
		stmt.setInt(1,id);
		stmt.setString(2, name);
		stmt.setString(3, s);
		stmt.setString(4, date);
		stmt.setDouble(5, fee);
		int rowcount=stmt.executeUpdate();
		if(rowcount>0)
		{
			System.out.println("Record successfully inserted");
		}
		else
		{
			System.out.println("Record not inserted");
		}
		
	}
	public void delete(int id) throws Exception
	{
		stmt=con.prepareStatement("delete from student where rollno = ?");
		stmt.setInt(1,id);
		int rowcount=stmt.executeUpdate();
		if(rowcount>0)
		{
			System.out.println(rowcount+" records deleted");
		}
		else
		{
			System.out.println("No records deleted");
		}
		
	}
	public void update(int id,double fee) throws Exception
	{
		stmt=con.prepareStatement("update student set fees=? where rollno=?");
		stmt.setDouble(1, fee);
		stmt.setInt(2, id);
		int rowcount=stmt.executeUpdate();
		if(rowcount>0)
		{
			System.out.println(rowcount+" records updated");
		}
		else
		{
			System.out.println("No records updated");
		}
		
	}
	public void display() throws Exception
	{
		stmt=con.prepareStatement("select * from student");
		ResultSet rs=stmt.executeQuery();
		if(rs.next())
		{
		do
		{
			System.out.printf("%4d %s %2s %s %9.2f",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4).toString(),rs.getDouble(5));
		}while(rs.next());
		}
		else
		{
			System.out.println("No records found");
		}
		
	}
	public void display(int id) throws Exception
	{
		stmt=con.prepareStatement("select * from student where rollno=?");
		stmt.setInt(1, id);
		ResultSet rs=stmt.executeQuery();
		if(rs.next())
		{
		do
		{
			System.out.printf("%4d %s %2s %s %9.2f",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4).toString(),rs.getDouble(5));
		}while(rs.next());
		}
		else
		{
			System.out.println("No records found");
		}
		
	}
	public void close() throws SQLException
	{
		con.close();
	}
}
