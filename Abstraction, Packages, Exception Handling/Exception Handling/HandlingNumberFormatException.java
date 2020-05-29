//Assignment Question 1
package exceptions;
import java.util.Scanner;
public class HandlingNumberFormatException {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		String input=sc.next();
		try
		{
			int num=Integer.parseInt(input);
			System.out.println("The square value is "+(num*num));
			System.out.println("The work has been done successfully");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer");
		}

	}

}
