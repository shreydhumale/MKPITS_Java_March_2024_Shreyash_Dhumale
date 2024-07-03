package currency_converter;


public class Currency {
	private static final double USD_TO_INR=83.47;
	private static final double INR_TO_USD=0.012;
	private static final double INR_TO_EURO=0.011;
		
	
	
	static double convertUSDtoINR(double amountUSD) {
		return amountUSD*USD_TO_INR;
	}
	
	static double convertINRtoUSD(double amountINR) {
		return amountINR*INR_TO_USD;
	}
	
	static double convertINRtoEURO(double amountEURO) {
		return amountEURO*INR_TO_EURO;
	}
}
