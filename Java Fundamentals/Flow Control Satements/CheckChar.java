/*
Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/
import java.util.Scanner;
public class CheckChar
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
String inp=sc.next();
char c=inp.charAt(0);
if(Character.isDigit(c))
{
System.out.println("Digit");
}
else
{
if(Character.isLetter(c))
{
System.out.println("Alphabet");
}
else
{
System.out.println("Special Character");
}
}
}
}
