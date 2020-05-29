package stringandstringbuffer;
import java.util.Scanner;
class FormString {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two Strings: \nString 1: ");
		String a=sc.next();
		System.out.println("String 2: ");
		String b=sc.next();
		String newString="";
		int difInLengths=a.compareTo(b);
		if(difInLengths<0)
		{
			newString=b+a+b;
		}
		else
		{
			newString=a+b+a;
		}
		System.out.println(newString);
	}

}
