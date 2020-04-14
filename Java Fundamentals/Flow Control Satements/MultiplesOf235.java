/*
Write a program to print first 5 values which are divisible by 2, 3, and 5.
*/
public class MultiplesOf235
{
public static void main(String[] args)
{
//As 2,3 and 5 are prime numbers, their product will be LCM. Else we need to find LCM.
int product=2*3*5;
int i=1;
while(i<=5)
{
System.out.println(product*i);
i++;
}
}
}