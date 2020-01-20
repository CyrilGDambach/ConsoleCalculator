package ch.bbw.cd.consolecalculator;

public class Calculator {
	public int summe(int s1, int s2) {
		return s1 + s2;
	}
	
	public int differenz(int v1, int v2) {
		long result = (long) v1 - (long) v2;
		
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new ArithmeticException();
		}
		return v1 - v2;
	}
}
