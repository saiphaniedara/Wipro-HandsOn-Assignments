package stringandstringbuffer;
import java.util.Scanner;
class StringConcat {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two strings :\nString 1: ");
		String str1=sc.next();
		System.out.println("String 2: ");
		String str2=sc.next();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
		{
			System.out.println(str1+str2.substring(1));
		}
		else
		{
			System.out.println(str1+" "+str2);
		}

	}

}
