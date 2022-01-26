package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author Peter Rutschmann
 * @version 0.0.1
 */
public class SaveCalculator {
	public int summe(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}


	//Noch un-safe Methoden, die müssen noch angepasst werden.
	public int subtraktion(int minuend, int subtrahend) throws ArithmeticException
	{
		long value = (long) minuend - (long) subtrahend;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return minuend - subtrahend;
	}


	public double division(double dividend, double divisor) {
		if (divisor != 0) {
			double value = dividend / divisor;
			if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
				throw new ArithmeticException();
			}
		} else {
			throw new ArithmeticException();
		}
		return dividend / divisor;
	}



	public double multiplikation(int multiplikator, int multiplikand) {
		long value = (long) multiplikator * (long) multiplikand;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return multiplikator * multiplikand;
	}
	//pow
	//sqrt
	//...
}
