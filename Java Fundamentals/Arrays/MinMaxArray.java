/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
*/
public class MinMaxArray
{
public static void main(String[] args)
{
int[] arr={2,5,7,1,9,4,3};
int min=arr[0];
int max=arr[0];
for(int i:arr)
{
if(i>max)
{
max=i;
}
if(i<min)
{
min=i;
}
}
System.out.println("Minimum is: "+min);
System.out.println("Maximum is: "+max);
}
}