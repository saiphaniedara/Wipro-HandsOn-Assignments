import java.sql.*;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try
		{
			int rno=Integer.parseInt(args[0]);
			con=new MakeConnection().connect();			
			PreparedStatement pstmt=con.prepareStatement("select rollno,student_name,standard from student where rollno=?");
			pstmt.setInt(1, rno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				int rollno=rs.getInt(1);
				String name=rs.getString(2);
				String stand=rs.getString(3);
				System.out.println("Record Exists...");
				System.out.println("Enter Leaving Date(DD-MON-YYYY): ");
				String ld=sc.next();
				pstmt=con.prepareStatement("insert into student_log values(?,?,?,?)");
				pstmt.setInt(1, rollno);
				pstmt.setString(2, name);
				pstmt.setString(3, stand);
				pstmt.setString(4, ld);
				int r=pstmt.executeUpdate();
				if(r>0)
				{
					pstmt=con.prepareStatement("delete from student where rollno=?");
					pstmt.setInt(1, rno);
					int row=pstmt.executeUpdate();
					if(row>0)
					{
						System.out.println("Record deleted");
					}
					else
					{
						System.out.println("Record not deleted");
					}
				}
				else
				{
					System.out.println("Record can't be deleted due to some problem.Please try again..");
				}
					
			}
			else
			{
				System.out.println("Record doesn't exist");
			}
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
