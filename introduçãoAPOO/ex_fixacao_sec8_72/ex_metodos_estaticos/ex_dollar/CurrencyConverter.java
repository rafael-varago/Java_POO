package entities;

public class CurrencyConverter {
	
	//6% of IOF
	public static final double IOF = 0.06;
	
	//added 6% of IOF in the total amount to be paid in reais
	public static double amountToBePaid(double dollarPrice, double dollarQtt) {
		return (dollarPrice * dollarQtt) + (IOF * dollarPrice * dollarQtt);
	}
	
}
