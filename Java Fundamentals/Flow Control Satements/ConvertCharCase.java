/*
Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
*/
import java.util.Scanner;
public class ConvertCharCase
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String inp=sc.next();
char c=inp.charAt(0);
if(Character.isUpperCase(c))
{
System.out.println(c+"->"+Character.toLowerCase(c));
}
else
{
System.out.println(c+"->"+Character.toUpperCase(c));
}
}
}