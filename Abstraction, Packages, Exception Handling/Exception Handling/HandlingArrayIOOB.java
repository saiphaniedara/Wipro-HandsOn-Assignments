//Assignment Question 2
package exceptions;
import java.util.Scanner;
public class HandlingArrayIOOB {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of elements in the array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access: ");
		int index=sc.nextInt();
		try
		{
			System.out.println("The array element at index "+index+" = "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getClass());
		}
	}
}
