//Java Program To Calculate Commission Using Standard Values
package commission;

public class CalculateCommission1 {
	public static void main(String arg[]) {
		double amount = 1000, commissionPercentage = 15;

		double commission = (commissionPercentage / 100) * amount;

		System.out.println("Commission amount=" + commission);
	}
}
