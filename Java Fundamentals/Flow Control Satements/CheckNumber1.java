/*
Write a program to check if a given integer number is odd or even.
*/
import java.util.Scanner;
public class CheckNumber1
{
public static void print(String a)
{
System.out.println("Given Number is "+a);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num%2==0)
{
CheckNumber1.print("Even");
}
else
{
CheckNumber1.print("Odd");
}
}
}