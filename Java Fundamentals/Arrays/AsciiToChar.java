/*
Initialize an integer array with ascii values and print the corresponding character values in a single row.
*/
public class AsciiToChar
{
public static void main(String[] args)
{
int[] arr={7,25,36,58,73,92,98};
char c;
for(int i:arr)
{
c=(char)i;
System.out.print(c+" ");
}
}
}