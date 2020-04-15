/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/
import java.util.Scanner;
public class LargeAndSmall
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of the array: ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int[] lr=new int[2];
int[] sr=new int[2];
lr[0]=sr[0]=arr[0];
for(int i:arr)
{
if(i>lr[0])
{
lr[0]=i;
}
if(i<sr[0])
{
sr[0]=i;
}
}
lr[1]=sr[0];
sr[1]=lr[0];
for(int i:arr)
{
if(i>lr[1]&&i<lr[0])
{
lr[1]=i;
}
if(i<sr[1]&&i>sr[0])
{
sr[1]=i;
}
}
System.out.println("Largest 2 numbers:");
for(int i:lr)
{
System.out.print(i+" ");
}
System.out.println("\nSmallest 2 numbers:");
for(int i:sr)
{
System.out.print(i+" ");
}
}
}