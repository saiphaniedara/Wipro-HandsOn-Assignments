//Assignment Question 8
package exceptions;

public class InavlidAgeException extends Exception{
String msg;
public InavlidAgeException(String str)
{
	msg=str;
}
public String toString()
{
	return msg;
}
}
