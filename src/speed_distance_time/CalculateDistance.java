package speed_distance_time;

import java.util.Scanner;

class CalculateDistance {
	public static void main(String args[]) {

		double speed, distance, time;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter speed in kmph ");

		speed = sc.nextDouble();

		System.out.println("enter time in hours ");

		time = sc.nextDouble();

		distance = speed * time;

		System.out.println("Distance in kilometers= " + distance + "km");

		System.out.println("Distance in meters= " + distance * 1000 + "m");

	}
}




/*

enter speed in kmph 
50
enter time in hours 
3
Distance in kilometers= 150.0km
Distance in meters= 150000.0

*/