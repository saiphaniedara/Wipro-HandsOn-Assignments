//Assignment Question 9
package exceptions;
import java.util.Scanner;
public class FindQuotient {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
	try
	{
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The quotient of "+a+"/"+b+" is "+(a/b));
	}
	catch(ArithmeticException e)
	{
		System.out.println("DivideByZeroException caught");
	}
	finally
	{
		System.out.println("Inside finally block");
	}
}
}
