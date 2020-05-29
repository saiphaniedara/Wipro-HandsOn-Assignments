package stringandstringbuffer;
import java.util.Scanner;
class RemoveX {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		String str=sc.next();
		if((str.charAt(0)=='x')&&(str.charAt(str.length()-1)=='x'))
		{
			System.out.println(str.substring(1,str.length()-1));
		}
		else
		{
			if(str.charAt(0)=='x')
			{
				System.out.println(str.substring(1));
			}
			else
			{
				if(str.charAt(str.length()-1)=='x')
				{
					System.out.println(str.substring(0,str.length()-1));
				}
				else
				{
					System.out.println(str);
				}
			}
		}

	}

}
