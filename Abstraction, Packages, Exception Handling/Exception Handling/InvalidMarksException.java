//Assignment Question 6
package exceptions;

public class InvalidMarksException extends Exception
{
	String msg;
	public InvalidMarksException(String a)
	{
		System.out.println("Invalid Marks");
		msg=a;
	}
	public String toString()
	{
		return msg;
	}
}
