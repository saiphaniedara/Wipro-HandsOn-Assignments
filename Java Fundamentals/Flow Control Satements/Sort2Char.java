/*
Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
*/
import java.util.Scanner;
public class Sort2Char
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String inp=sc.next();
char c1=inp.charAt(0);
inp=sc.next();
char c2=inp.charAt(0);
if(c1>c2)
{
System.out.println(c2+","+c1);
}
else
{
System.out.println(c1+","+c2);
}
}
}