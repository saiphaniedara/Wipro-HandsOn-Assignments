import java.sql.*;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try
		{
			int rno=Integer.parseInt(args[0]);
			double fee=Double.parseDouble(args[1]);
			con=new MakeConnection().connect();
			PreparedStatement pstmt=con.prepareStatement("update student set fees=? where rollno=?");
			pstmt.setDouble(1, fee);
			pstmt.setInt(2,rno);
			int row=pstmt.executeUpdate();
			if(row>0)
			{
				System.out.println("Successfully Updated");
			}
			else
			{
				System.out.println("Couldn't be updated. Try again...");
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
