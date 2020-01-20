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
	/*Tests for method Differenz*/
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.differenz(25,10) == 15);
	}

}
