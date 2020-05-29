package stringandstringbuffer;
import java.util.Scanner;
class StringRepeat {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		String strnew="";
		for(int i=0;i<str.length();i++)
		{
			strnew+=str.substring(0,2);
		}
		System.out.println(strnew);
	}

}
