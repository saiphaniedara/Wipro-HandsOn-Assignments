//Assignment Question 4
package exceptions;

public class MathOperation {
	public static void main(String[] args) throws Exception{
		try
		{
		int[] arr=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			sum+=arr[i];
		}
		int avg=sum/5;
		System.out.println("Sum of elements is: "+sum);
		System.out.println("Average of elements is "+avg);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter 5 values");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter only integer values");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
