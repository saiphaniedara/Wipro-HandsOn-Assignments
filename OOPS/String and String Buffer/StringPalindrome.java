package stringandstringbuffer;
import java.util.Scanner;
class StringPalindrome {
static Scanner sc=new Scanner(System.in);
public static boolean isPalindrome(String text) {
	StringBuffer sb=new StringBuffer(text);
	sb=sb.reverse();
	if(text.equals(sb.toString()))
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
        String text=sc.nextLine();
        if(isPalindrome(text))
        {
        	System.out.println("The Entered String is Palindrome");
        }
        else
        {
        	System.out.println("The Entered String is not Palindrome");
        }
        
	}

}
