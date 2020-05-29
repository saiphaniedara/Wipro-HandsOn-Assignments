package stringandstringbuffer;
import java.util.Scanner;
class RemoveFirstAndLast {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		System.out.println(str.substring(1,str.length()-1));
	}

}
