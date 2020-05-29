/*
Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/
public class PrintPOI
{
public static void main(String[] args)
{
String gen=args[0];
int age=Integer.parseInt(args[1]);
if(age>=1&&age<=58)
{
if(gen.equals("Female"))
{
System.out.println("The percentage of interest is 8.2%");
}
else
{
System.out.println("The percentage of interest is 8.4%");
}
}
else
{
if(age>=59&&age<=100)
{
if(gen.equals("Female"))
{
System.out.println("The percentage of interest is 9.2%");
}
else
{
System.out.println("The percentage of interest is 10.5%");
}
}
}
}
}