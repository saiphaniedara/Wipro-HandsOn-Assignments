/*
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/
import java.util.Scanner;
public class SumOfElements
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
int n=sc.nextInt();
int[] arr=new int[n];
int iof6=-1,iof7=-1;
System.out.println("Enter elements of array: ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(arr[i]==6)
{
iof6=i;
}
if(arr[i]==7)
{
iof7=i;
}
}
int sum=0;
if(iof7-iof6>0)
{
for(int i=0;i<iof6;i++)
{
sum+=arr[i];
}
for(int i=iof7+1;i<n;i++)
{
sum+=arr[i];
}
}
else
{
for(int i:arr)
{
sum+=i;
}
}
System.out.println(sum);
}
}
