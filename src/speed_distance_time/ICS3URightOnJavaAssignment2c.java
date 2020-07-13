package speed_distance_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ICS3URightOnJavaAssignment2c {
	public static void main (String[] args) throws Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String d; //creates a string variable to get distance (travelled) from user
        double distance = 0.0; //double distance
        System.out.print("Enter distance travelled(KM): ");  //gets distance travelled from user
        d = buffer.readLine(); //reads a line from the console
        distance = Double.parseDouble(d);//gets the double value from string variable d
        System.out.println("Distance Travelled: " + d); //states string variable d

        new BufferedReader(new InputStreamReader(System.in));

        String t; //creates a string variable to get time (travelled) from user
        double time = 0.0; //double time
        System.out.print("Enter time travelled(Minutes): "); //gets time travelled from user
        t = buffer.readLine(); //reads a line from the console
        time = Double.parseDouble(t);//gets the double value from string variable t
        System.out.println("Time Travelled: " + t); //states string variable t

        System.out.println("The average speed (KM/H) with a distance travelled of " + d + " Km and time travelled of " + t + " mins is " + distance / time);

        /*speed (average) = distance divided by time*/      
    }
}