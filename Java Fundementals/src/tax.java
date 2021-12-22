
public class tax {

	private static int[] taxCents(double dollar, double tax) {
			double taxNum = dollar * tax/100;
			int cents = (int) Math.round(100*taxNum);
			int[] taxAmount = new int[1];
			
			taxAmount[0] = cents;
			
		return taxAmount;
	}
	
	public static void main(String[] args) {
		double dollar = 16;
		double tax = 20;
		
		int[] arr = taxCents(dollar, tax);
		
		System.out.print(arr[0]);
	}

}
