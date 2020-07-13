package speed_distance_time;

public class Demo {
	public static void main(String[] args) {
		int speed;
		long days, seconds, dist;
		speed = 186000;
		days = 365;
		seconds = days * 24 * 60 * 60;
		dist = speed * seconds;
		System.out.print("Light travels: " + dist + " miles");
	}
}