//Assignment Question 7
package exceptions;

public class InvalidCountryException extends Exception{
	String msg;
	public InvalidCountryException(String str)
	{
		msg=str;
	}
	public String toString()
	{
		return msg;
	}

}
