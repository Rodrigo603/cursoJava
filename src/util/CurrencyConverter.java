package util;

public class CurrencyConverter {
	public static double TAX = 0.06;
	public static double Converter(double dollarPrice,double dollarQty) {
		return (dollarPrice * dollarQty) + (dollarPrice * dollarQty * TAX); 
	}
}
