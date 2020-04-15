/*
Write a program to check if a given integer number is Positive, Negative, or Zero. 
*/
import java.util.Scanner;
public class CheckNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num>0)
{
System.out.println("Given Integer is Positive");
}
else{
if(num<0)
{
System.out.println("Given Integer is Negative");
}
else
{
System.out.println("Given Integer is Zero");
}
}
}
}