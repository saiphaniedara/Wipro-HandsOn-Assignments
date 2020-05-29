//Assignment Question 7
package exceptions;
import java.util.Scanner;
public class UserRegistration {
static Scanner sc=new Scanner(System.in); 
public void registerUser(String userName, String userCountry) throws InvalidCountryException
{
	if(userCountry.equalsIgnoreCase("India"))
	{
		System.out.println("User registration done successfully");
	}
	else
	{
		throw new InvalidCountryException("User Outside India cannot be registered");
	}
}
	public static void main(String[] args) {
		System.out.println("Enter User Name: ");
		String userName=sc.next();
		System.out.println("Enter User Country: ");
		String userCountry=sc.next();
		UserRegistration user=new UserRegistration();
		try
		{
			user.registerUser(userName,userCountry);
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e);
		}
		
	}

}
