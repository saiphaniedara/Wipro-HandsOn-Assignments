package stringandstringbuffer;
import java.util.Scanner;
class RepeatSubString {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String str=sc.next();
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		String newString="";
		for(int i=0;i<n;i++)
		{
			newString+=str.substring(str.length()-n);
		}
		System.out.println(newString);
	}

}
