package Java;

import java.util.Scanner;

public class Hello_World {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello User: May I know your Name please:");
		String inputFromScanner = scan.next();
		System.out.println("Hye " + inputFromScanner
				+ " Welcome to the Hello World");
		System.out.println("Enjoy Your Trip.");
	}
}
