package discount;

import java.util.Scanner;

public class Discount5 {
	public static void main(String[] args) {

		int bill;
		int discount;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter bill amount:");
		bill = in.nextInt();

		System.out.println("Enter discount percentage:");
		discount = in.nextInt();

		int afterDiscount = bill - (bill * discount / 100);

		System.out.println("After discount your bill is: " + afterDiscount);

	}
}
