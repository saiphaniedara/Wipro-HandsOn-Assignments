/*
Write a program to print prime numbers between 10 and 99.
*/
public class PrintPrimes
{
public static void main(String[] args)
{
for(int i=10;i<=99;i++)
{
double sr=Math.sqrt(i);
long s=Math.round(sr);
for(int j=2;j<=s;j++)
{
if(i%j==0)
{
break;
}
if(j==s)
{
System.out.println(i);
}
}
}
}
}
