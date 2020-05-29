package stringandstringbuffer;
import java.util.Scanner;
class AlternateCharcters {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two Strings: \nString 1: ");
		String a=sc.next();
		System.out.println("String 2: ");
		String b=sc.next();
		String newString="";
		if(a.length()>=b.length())
		{
			int i=0;
			for(;i<b.length();i++)
			{
				newString+=a.charAt(i);
				newString+=b.charAt(i);
			}
			if(a.length()>b.length())
			{
				newString+=a.substring(i);
			}
		}
		else
		{
			int i=0;
			for(;i<a.length();i++)
			{
				newString+=a.charAt(i);
				newString+=b.charAt(i);
			}
			newString+=b.substring(i);
		}
		System.out.println(newString);
	}

}
