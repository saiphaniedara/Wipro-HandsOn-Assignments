package classesandobjects;

class Calculator {
public static double powerInt(int num1,int num2) 
{
	return Math.pow(num1,num2);
}
public static double powerDouble(double num1,int num2)
{
	return Math.pow(num1,num2);
}
	public static void main(String[] args) {
		System.out.println("The value of 10 to the power of 5 is : "+powerInt(10,5));
		System.out.println("The value of 12.5 to the power of 4 is :"+powerDouble(12.5,4));
		}

}
