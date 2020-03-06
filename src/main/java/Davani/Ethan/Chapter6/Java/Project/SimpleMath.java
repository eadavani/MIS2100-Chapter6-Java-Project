package Davani.Ethan.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new ArithmeticException();
		}
		return numerator / denominator;

	}
}
