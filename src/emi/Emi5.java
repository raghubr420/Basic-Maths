package emi;

public class Emi5 {
	public static void main(String args[]) {
		double principal, rate, time, emi;

		principal = Double.parseDouble(args[0]);

		rate = Double.parseDouble(args[1]);

		time = Double.parseDouble(args[2]);

		System.out.println(" principal amount is : " + principal);

		System.out.println("intrest rate is : " + rate);

		System.out.println("time period is: " + time);

		rate = rate / (12 * 100);

		time = time * 12;

		emi = (principal * rate * Math.pow(1 + rate, time))
				/ (Math.pow(1 + rate, time) - 1);

		System.out.println("Monthly EMI is= " + emi + "\n");

	}
}
