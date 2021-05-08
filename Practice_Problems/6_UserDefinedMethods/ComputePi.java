//***************************************************************************************
// ComputePi.java		Author: Jake Byford
//
// Demonstrates choosing points at random an arbitrarily large number of times, 
// the ratio of the number of points which lie within the circle to the number of points 
// within the unit square (all of them) will approach π/4.
//
//****************************************************************************************

import java.util.*;
public class ComputePi

{
	//This function returns true if point(x,y) is inside circle
	//returns false otherwise
	public static boolean isInside (double x, double y) {  
			// Calculate distance from origin
			double distance = Math.sqrt((x * x) + (y * y));
			return (distance < 1.0); //return true/false based on distance
	}

	// This function calculates PI value
	public static double calculatePI (int num) {
		// initialize random number generator
		Random random = new Random (System.currentTimeMillis());   
		int repeats = 0; //initialize repeats to 0
		double PI = 0; //initially set Pi  value to 0
		
		//loop through n times
		for (int i = 1; i <= num; i++) {
			double x = (random.nextDouble()) * 2 - 1.0; //generate x value randomly
			double y = (random.nextDouble()) * 2 - 1.0; //generate y value randomly
			// check (x,y) is inside unit circle or not by cally function isInside()
			if (isInside(x, y)) {
				repeats++;
		  }
		}
		
		double dRepeats = num; //total iterations

		//calculate PI value using formula 4*(total points inside circle(repeats)/total points(dRepeats))
		PI = (4.0 * (repeats/dRepeats));

		return PI; //return Pi value
	}
  
	//main() function. execution starts here
	public static void main (String[] args) {
//		Scanner scan = new Scanner (System.in);
//			int num = scan.nextInt();
			double PI = calculatePI(1000000); // could use num as scan-input but we hard code to 1,000,000
			System.out.println ("approximate value of PI = " + PI);   
		}
}