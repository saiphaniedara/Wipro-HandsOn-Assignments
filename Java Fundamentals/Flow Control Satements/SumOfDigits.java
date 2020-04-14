/*
Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
*/
import java.util.Scanner;
public class SumOfDigits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sod=0;
for(;num!=0;)
{
sod+=num%10;
num/=10;
}
System.out.println(sod);
}
}

