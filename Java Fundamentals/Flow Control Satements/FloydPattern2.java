/*
 Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
*/
//Using while loop
public class FloydPattern2
{
public static void main(String[] args)
{
if(args.length==1)
{
int num=Integer.parseInt(args[0]);
int i=0;
while(i<num)
{
int j=0;
while(j<=i)
{
System.out.print("* ");
j++;
}
System.out.println();
i++;
}
}
else
{
System.out.println("please enter an integer number");
}
}
}