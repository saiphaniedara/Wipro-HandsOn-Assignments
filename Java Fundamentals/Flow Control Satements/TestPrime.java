/*
Write a Java program to find if the given number is prime or not.

Example1)
C:\>java Sample 
O/P: Please enter an integer number 

Example2)
C:\>java Sample 1
O/P:1 is neither prime nor composite

Example3)
C:\>java Sample 0
O/P: 0 is neither prime nor composite
 
Example4)
C:\>java Sample 10
O/P: 10 is not a prime number

Example5)
C:\>java Sample 7
O/P : 7 is a prime number
*/
public class TestPrime
{
public static void main(String[] args)
{
if(args.length==1)
{
int num=Integer.parseInt(args[0]);
if(num<2)
{
System.out.println(num+" is neither prime nor composite");
System.exit(1);
}
if(num==2)
{
System.out.println("2 is a prime number");
}
else
{
double sr=Math.sqrt(num);
long s=Math.round(sr);
for(int i=2;i<=s;i++)
{
if(num%i==0)
{
System.out.println(num+" is not a prime number");
break;
}
if(i==s)
{
System.out.println(num+" is a prime number");
}
}
}
}
else
{
System.out.println("please enter an integer number");
}
}
}