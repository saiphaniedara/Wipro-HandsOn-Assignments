/*
Write a program to initialize an array and print them in a sorted order.
*/
import java.util.Arrays;
import java.util.Scanner;
public class SortArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array: ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter values :");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("Sorted Array");
for(int i:arr)
{
System.out.println(i);
}
}
}