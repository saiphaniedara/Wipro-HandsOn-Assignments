/*
Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/
public class TestPalindrome
{
public static void main(String[] args)
{
int num=Integer.parseInt(args[0]);
int a=num;
int rev=0;
while(a!=0)
{
rev=rev*10+a%10;
a/=10;
}
if(num==rev)
{
System.out.println(num+" is a palindrome");
}
else
{
System.out.println(num+" is not a palindrome");
}
}
}
