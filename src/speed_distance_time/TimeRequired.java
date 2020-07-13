package speed_distance_time;

import java.util.Scanner;

public class TimeRequired {
	public static void main(String[] args)
   {
    // Variables
      int speed;
          int distance;
          float time;
          float hour = 0;
      float minutes = 0;
      float seconds = 0;
      Scanner scan = new Scanner(System.in);
      // Speed of Traveler
      System.out.print("Enter the Speed in MPH ");
      speed = scan.nextInt();
      // Distance Traveled
      System.out.print("Enter the Distance Traveled ");  
      distance = scan.nextInt();
          // calculations
//the calculations i have tried keep coming up with wrong ones..
          //Display
          System.out.println("Time in Hours: "+hour);
          System.out.println("Time in Minutes: "+minutes);
          System.out.println("Time in Seconds: "+seconds);
          System.out.println("The Total Time is: "+hour+":"+minutes+":"+seconds);
   }
}