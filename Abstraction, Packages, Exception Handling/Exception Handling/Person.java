//Assignment Question 8
package exceptions;

public class Person {

	public static void main(String[] args) {
		try
		{
			String name=args[0];
			int age=Integer.parseInt(args[1]);
			if(age<18)
			{
			throw new InavlidAgeException("Sorry, cannot be enrolled because your age is below 18");
			}
			if(age>=60)
			{
				throw new InavlidAgeException("Sorry, cannot be enrolled because your age is above 59");
			}
			System.out.println("Person Enrolled successfully");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter two values where the first one must be name and the second must be age");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Age must be entered as an integer value");
		}
		catch(InavlidAgeException e)
		{
			System.out.println(e);
		}

	}

}
