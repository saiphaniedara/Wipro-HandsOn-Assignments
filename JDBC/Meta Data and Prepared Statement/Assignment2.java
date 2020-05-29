import java.util.Scanner;
import java.sql.*;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of records to insert: ");
		int n=sc.nextInt();
		int rollno;
		String name,standard,dob;
		Connection con=null;
		try
		{
			try
			{
				con=new MakeConnection().connect();
			}
			catch(Exception e)
			{
				System.out.println("Connection can't be established.Try again...");
			}
			PreparedStatement pstmt=con.prepareStatement("insert into student(rollno,student_name,standard,date_of_birth) values(?,?,?,?)");
			for(int i=0;i<n;i++)
			{
				System.out.println("Student-"+(i+1)+" Details: ");
				System.out.println("Enter Rollno(4-digit number): ");
				rollno=sc.nextInt();
				System.out.println("Enter Name(Maximum 20 characters): ");
				name=sc.next();
				System.out.println("Enter Standard(Roman Letters representing I to X(I, II,….IX, X)): ");
				standard=sc.next();
				System.out.println("Enter Date of Birth(DD-MON-YYYY): ");
				dob=sc.next();
				pstmt.setInt(1, rollno);
				pstmt.setString(2, name);
				pstmt.setString(3, standard);
				pstmt.setString(4, dob);
				try
				{
					int row=pstmt.executeUpdate();
					if(row>0)
					{
						System.out.println("Record Inserted");
					}
					else
					{
						System.out.println("Record not inserted");
					}
				}
				catch(SQLException e)
				{
					System.out.println("Entered values are not in specified format. Try again....");
					i--;
				}
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Couldn't close connection");
		}
	}

}
