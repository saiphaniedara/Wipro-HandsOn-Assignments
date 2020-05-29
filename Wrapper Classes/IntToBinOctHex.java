
public class IntToBinOctHex {

	public static void main(String[] args) {
		try
		{
			Integer num=new Integer(args[0]);
			System.out.println("Given Number: "+num.intValue());
			System.out.println("Binary equivalent: "+Integer.toBinaryString(num.intValue()));
			System.out.println("Octal equivalent: "+Integer.toOctalString(num.intValue()));
			System.out.println("Hexadecimal equivalent: "+Integer.toHexString(num.intValue()));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You must enter 1 value");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered value must be an integer");
		}

	}

}
