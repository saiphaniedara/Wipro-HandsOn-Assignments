//Assignment Question 6
package exceptions;
import java.util.Scanner;
public class HandlingNF {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
	try
	{
		String[] names=new String[2];
		int[][] marks=new int[2][3];
		int sumOfMarks=0;
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter name of Student-"+(i+1)+": ");
			names[i]=sc.next();
			System.out.println("Enter Marks of Student-"+(i+1)+":");
			for(int j=0;j<3;j++)
			{
				System.out.println("Subject-"+(j+1)+": ");
				marks[i][j]=Integer.parseInt(sc.next());
				if(marks[i][j]<0)
				{
					throw new InvalidMarksException("Marks should be positive values");
				}
				if(marks[i][j]>100)
				{
					throw new InvalidMarksException("Marks should be between 0 and 100");
				}
				sumOfMarks+=marks[i][j];
			}
		}
		System.out.println("Average marks of two students is "+sumOfMarks/2);
	}
	catch(NumberFormatException e)
	{
		System.out.println("Subject marks should be integer values");
	}
	catch(InvalidMarksException e)
	{
		System.out.println(e);
	}
}
}
