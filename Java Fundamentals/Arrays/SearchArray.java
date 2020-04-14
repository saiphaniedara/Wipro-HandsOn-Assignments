/*
Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/
import java.util.Arrays;
import java.util.Scanner;
public class SearchArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] arr={1,4,34,56,7};
System.out.println("Enter search element: ");
int key=sc.nextInt();
int res=Arrays.binarySearch(arr,key);
if(res>=0)
{
System.out.println(res);
}
else
{
System.out.println("-1");
}
}
}
