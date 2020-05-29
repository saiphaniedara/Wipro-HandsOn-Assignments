package junit.tests;

public class Demo2 {
public boolean palindromeCheck(String str)
{
	String strrev=new String(new StringBuffer(str).reverse());
	if(str.equals(strrev))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
