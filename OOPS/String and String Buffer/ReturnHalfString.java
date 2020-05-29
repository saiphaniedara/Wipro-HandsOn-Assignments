package stringandstringbuffer;
import java.util.Scanner;
class ReturnHalfString {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		if(str.length()%2==0)
		{
			System.out.println(str.substring(0,(str.length()/2)));
		}
		else
		{
			System.out.println("null");
		}
	}

}