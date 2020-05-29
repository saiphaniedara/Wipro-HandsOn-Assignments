package stringandstringbuffer;
import java.util.Scanner;
class RemoveCharacters {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String str=sc.next();
		int pos=str.indexOf('*');
		if(pos!=0&&pos!=str.length()-1)
		{
		System.out.println(str.substring(0,pos-1)+str.substring(pos+2));
		}
		else
		{
			if(pos==0)
			{
			System.out.println(str.substring(pos+2));
			}
			else
			{
				System.out.println(str.substring(0,pos-1));
			}
		}
	}

}
