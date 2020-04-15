/*
Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/
import java.util.Scanner;
public class RemoveDuplicates
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter elements of array: ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int[] res=new int[n];
int k=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<=k;j++)
{
if(res[j]==arr[i])
{
break;
}
if(j==k)
{
res[k]=arr[i];
k++;
break;
}
}
}
System.out.println("Resultant Array: ");
for(int i=0;i<k;i++)
{
System.out.println(res[i]);
}
}
}
