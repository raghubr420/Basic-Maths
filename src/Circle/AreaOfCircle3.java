//Java Program Using Inheritance
package Circle;

import java.util.Scanner;

class AreaCalculation {
	double area;

	void circle(double r) {
		area = (22 * r * r) / 7;
	}
}

public class AreaOfCircle3 extends AreaCalculation {
	public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      AreaOfCircle3  a=new AreaOfCircle3();
      a.circle(rad);
      System.out.println("Area of Circle is: " + a.area);      
   }
}
