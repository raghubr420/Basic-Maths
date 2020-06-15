//Using Interface
package Circle;

import java.util.Scanner;

interface AreaCal {
	void circle();
}

public class AreaOfCircle2 implements AreaCal {
	double area;

	public void circle(double r) {
		area = (22 * r * r) / 7;
	}

	public static void main(String args[]) {
		AreaOfCircle2 x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double rad = s.nextDouble();
		x = new AreaOfCircle2();
		x.circle(rad);
		System.out.println("Area of Circle is: " + x.area);
	}

	public void circle() {
		// TODO Auto-generated method stub
		
	}

}
