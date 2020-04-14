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
//Using for loop
public class FloydPattern1
{
public static void main(String[] args)
{
if(args.length==1)
{
int num=Integer.parseInt(args[0]);
for(int i=0;i<num;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
else
{
System.out.println("please enter an integer number");
}
}
}