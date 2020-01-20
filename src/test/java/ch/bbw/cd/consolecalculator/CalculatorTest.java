package ch.bbw.cd.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	/*Tests for method Summe*/
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}	

	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.summe(-3, -10) == -13);
	}
	
	@Test
	public void testSummeEinPositivEinNegativIsOk() {
		assertTrue(testee.summe(-3, 10) == 7);
	}
	
	@Test
	public void testSummeZeroIsOk() {
		assertTrue(testee.summe(0, 0) == 0);
	}
	
	@Test
	public void testSummeMaxvalueIsOk() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}

	@Test(expected = ArithmeticException.class)
	public void testSummeMaxvalueIsNOk() {
		testee.summe(Integer.MAX_VALUE, 1);
	}

	@Test
	public void testSummeMinvalueIsOk() {
		assertTrue(testee.summe(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testSummeMinvalueIsNOk() {
		testee.summe(Integer.MIN_VALUE, -1);
	}
	/*Tests for method Differenz*/
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.differenz(25,10) == 15);
	}
	
	@Test
	public void testDifferenzZweiNegativeIsOk() {
		assertTrue(testee.differenz(-5, -10) == 15);
	}
	
	@Test
	public void testDifferenzEinPositivEinNegativIsOk() {
		assertTrue(testee.differenz(-5, 10) == -15);
	}
	
	@Test
	public void testDifferenzZeroIsOk() {
		assertTrue(testee.differenz(0, 0) == 0);
	}
	
	@Test
	public void testDifferenzMaxvalueIsOk() {
		assertTrue(testee.differenz(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}

	@Test(expected = ArithmeticException.class)
	public void testDifferenzMaxvalueIsNOk() {
		testee.differenz(Integer.MAX_VALUE, -1);
	}

	@Test
	public void testDifferenzMinvalueIsOk() {
		assertTrue(testee.differenz(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
	}

	@Test(expected = ArithmeticException.class)
	public void testDifferenzMinvalueIsNOk() {
		testee.differenz(Integer.MIN_VALUE, 1);
	}
	/*Tests for method Division*/
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.divide(10, 2) == 5);
	}

	@Test
	public void testDivisionZweiNegativeIsOk() {
		assertTrue(testee.divide(-10, -2) == 5);
	}
	
	@Test
	public void testDivisionEinPositivEinNegativIsOk() {
		assertTrue(testee.divide(10, -2) == -5);
	}
	
	@Test
	public void testDivisionMaxvalueIsOk() {
		assertTrue(testee.divide(Integer.MAX_VALUE, 1) == Integer.MAX_VALUE);
	}
	
	@Test
	public void testDivisionMaxvalueIsNOk() {
		assertTrue(testee.divide(Integer.MAX_VALUE+1, 1) == Integer.MAX_VALUE+1);
	}
	
	@Test
	public void testDivisionMinvalueIsOk() {
		assertTrue(testee.divide(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE);
	}

	@Test
	public void testDivisionMinvalueIsNOk() {
		assertTrue(testee.divide(Integer.MIN_VALUE-1, 1) == Integer.MIN_VALUE-1);
	}
}
