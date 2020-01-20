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
	public void test_summe_zweiNegative_OK() {
		assertTrue(testee.summe(-3, -10) == -13);
	}
	
	/*Tests for method Differenz*/
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.differenz(25,10) == 15);
	}

}
