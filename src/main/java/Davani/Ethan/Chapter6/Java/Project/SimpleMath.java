package Davani.Ethan.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new ArithmeticException();
		}
		return numerator / denominator;

	}
	public double multiply(double number1, double number2) {
		return number1 * number2;
		
	}
}
