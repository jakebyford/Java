// ************************************************************************************************************
// Towers Of Hanoi /Main.java			Author: Jake Byford								Spring 2021
//
// CS 506852                        	Found. of Computer Science						ID: 31556607
//
// ************************************************************************************************************

import java.util.*;

public class Main {

	static int count = 1;
	
	public static void main(String[] arg) {
		Scanner scnr = new Scanner(System.in);
		int x;
		
		System.out.print("Input number of disks (max 6): ");
		move(x = scnr.nextInt(), "A", "B", "C");
		
	}
	
	public static void move(int n, String start, String temp, String end) {
		if (n > 0) {
			if(n == 1) {
				System.out.println(count + " Move disk " + n + " from "+ start + " to " + temp);
				++count;
			}
			else {
				move(n - 1, start, end, temp);
				System.out.println(count + " Move disk " + n + " from " + start + " to " + temp);
				++count;
				move(n - 1, end, temp, start);
			}
		}	
	} 
}