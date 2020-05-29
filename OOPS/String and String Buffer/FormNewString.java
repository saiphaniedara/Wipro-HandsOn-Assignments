package stringandstringbuffer;
import java.util.Scanner;
class FormNewString {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two Strings:\nString 1: ");
		String a=sc.next();
		System.out.println("String 2: ");
		String b=sc.next();
		String newString="";
		int i=-1;
		while(true)
		{
			i=a.indexOf(b,i+1);
			if(i<0)
			{
				break;
			}
			if(i!=0&&(i<a.length()-b.length()))
			{
				newString+=a.charAt(i-1);
				newString+=a.charAt(i+b.length());
			}
			else
			{
				if(i==0&&i<a.length()-b.length())
				{
					newString+=a.charAt(i+b.length());	
				}
				else
				{
					if(i>=a.length()-b.length())
					{
						newString+=a.charAt(i-1);
					}
				}
			}		
		}
		System.out.println(newString);
	}
}
