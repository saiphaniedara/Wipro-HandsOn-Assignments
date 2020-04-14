/*
Write a program to check if a given number is prime or not.
*/
import java.util.Scanner;
public class TestForPrime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num<2)
{
System.out.println("Not a prime");
System.exit(1);
}
if(num==2)
{
System.out.println("Prime");
System.exit(1);
}
double sr=Math.sqrt(num);
long s=Math.round(sr);
for(int i=2;i<=s;i++)
{
if(num%i==0)
{
System.out.println("Not a prime");
break;
}
if(i==s)
{
System.out.print("Prime");
}
}
}
}