package entities;

public class CurrencyConverter {
	public static final double tax = 0.06;
	
	public static double CalculatorDolar(double dolarPrice, double reais) {
		return reais * dolarPrice * tax + reais * dolarPrice;
	}
}
