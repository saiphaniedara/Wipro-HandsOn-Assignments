//Assignment Question 5
package exceptions;
import java.util.Scanner;
public class HandlingAE {
static Scanner sc=new Scanner(System.in);
public static double divide(int num1,int num2) throws ArithmeticException
{
	return num1/num2;
}
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try
		{
			System.out.println("The division of "+num1+" and "+num2+" is "+divide(num1,num2));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number-2 should not be zero");
		}
	}

}
