package junit.tests;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
public class Demo2Test {
	Demo2 d=null;
	@Before
	public void before()
	{
		d=new Demo2();
	}
	@Test
	public void testPalindromeCheck() {
		assertTrue(d.palindromeCheck("mom"));
		assertTrue(d.palindromeCheck("madam"));
		assertTrue(d.palindromeCheck("malayalam"));
	}

}
