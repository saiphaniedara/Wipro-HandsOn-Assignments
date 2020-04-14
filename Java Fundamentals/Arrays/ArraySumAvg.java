/*
Write a program to initialize an integer array and print the sum and average of the array.
*/
public class ArraySumAvg
{
public static void main(String[] args)
{
int[] arr1=new int[]{1,2,3,4,5};
int sum=0;
for(int i:arr1)
{
sum+=i;
}
int avg=sum/arr1.length;
System.out.println("Sum is "+sum);
System.out.println("Average is "+avg);
}
}
