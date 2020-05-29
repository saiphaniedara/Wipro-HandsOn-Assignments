import java.util.Scanner;
public class IntToBinReps {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a integer value between 1 and 255: ");
		int num=sc.nextInt();
		if(num<1||num>255)
		{
			System.out.println("Please try again by entering a number between 1 and 255");
		}
		else
		{
			String binnum=Integer.toBinaryString(num);
			if(binnum.length()<8)
			{
				for(int i=binnum.length();i<8;i++)
				{
					binnum="0"+binnum;
				}
			}
			System.out.println(binnum);
		}
	}

}
