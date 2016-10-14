package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import org.junit.Rule;

public class CalculatorTest 
{

	@Test
	public void testEmptyString() 
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() 
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() 
	{
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testUnknownNumbers() 
	{
		assertEquals(3+5+12+44+75+23+2, Calculator.add("3,5,12,44,75,23,2"));
	}

	@Test
	public void testNewLine() 
	{
		assertEquals(3+3+3, Calculator.add("3\n3,3"));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAddNeg()
	{
		assertEquals("Negatives not allowed: -1,-5", Calculator.add("-1,5,1,-5"));
	}

	@Test
	public void testOverThousand() 
	{
		assertEquals(2, Calculator.add("1001,1003,2"));
	}

	@Test
	public void testDelimeter() 
	{
		assertEquals(4+6, Calculator.add("//;\n4;6"));
	}
}
