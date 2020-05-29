package interfaces;

public class AdultUsers implements LibraryUser{
	private int age;
	private String bookType;
	public AdultUsers(int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount()
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be more than 12 to register as an Adult");
		}
	}
	public void requestBook()
	{
		if(bookType.equalsIgnoreCase("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}
