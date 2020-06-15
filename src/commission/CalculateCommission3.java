//Through Command Line Arguments
package commission;

public class CalculateCommission3 {
	public static void main(String args[]) {
		double amount = Double.parseDouble(args[0]);

		double commissionPercentage = Double.parseDouble(args[1]);

		double commission = (commissionPercentage / 100) * amount;

		System.out.println("Commission amount=" + commission);

	}
}
