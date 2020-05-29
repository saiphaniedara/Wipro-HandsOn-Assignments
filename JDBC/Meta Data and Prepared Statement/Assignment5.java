import java.sql.*;
public class Assignment5 {
	public static void main(String[] args) throws Exception
	{
			Connection con=new MakeConnection().connect();
			PreparedStatement pstmt;
			if(args.length==0)
			{
				pstmt=con.prepareStatement("select * from student");
			}
			else
			{
				int rno=Integer.parseInt(args[0]);
				pstmt=con.prepareStatement("select * from student where rollno=?");
				pstmt.setInt(1, rno);
			}
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) 
			{
				do
				{
					System.out.printf("%4d %s %s %s %9.2f",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getDouble(5));
					System.out.println();
				}while(rs.next());
			}
			else
			{
				System.out.println("No records Found");
			}
	}
}
