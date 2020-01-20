package ch.bbw.cd.consolecalculator;

public class Calculator {
	public int summe(int s1, int s2) {
		long result = (long) s1 + (long) s2;

		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new ArithmeticException();
		}
		return s1 + s2;
	}

	public int differenz(int v1, int v2) {
		long result = (long) v1 - (long) v2;
		
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new ArithmeticException();
		}
		return v1 - v2;
	}
	
	public int multiply(int faktor1, int faktor2) {
		return faktor1 * faktor2;
	}
}
