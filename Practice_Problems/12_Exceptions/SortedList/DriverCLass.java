//************************************************************************************************************
//DriverClass.java					Author: Jake Byford								Spring 2021
//
//CS 505852                        	Prog Data Struct & Algo							ID: 31556607
//
//************************************************************************************************************
import java.util.Iterator;

	// Create the class

	public class DriverCLass {

		// Method to display the values of the list.
	
		public static void DisplayList(SortedList<Integer>list) {
	
			System.out.print("Sorted List:");
		
			// use for loop to iterate the list.
		
			for(Iterator<Integer> iterator = list.iterator();
		
			iterator.hasNext(); )
		
			{
		
			System.out.print(" "+ iterator.next());
		
			}
		
			System.out.println("\n");
		
			}
		
		// Start the main method of the program.
	
		public static void main(String[] args) {
	
		// Create an object of the SortedList class.
	
			SortedList<Integer> values =
		
			new SortedList<Integer>();
		
			// insert the values in the list.
		
			values.insert(80);
		
			values.insert(20);
		
			values.insert(10);
		
			// Display the list.
		
			DisplayList(values);
		
			// Remove the value from the list.
		
			System.out.println("Removing the value 10 from the list.");
		
			values.remove(10);
		
			// Display the list.
		
			DisplayList(values);
		
			// insert the value in the list.
		
			System.out.println("Inserting the value 50 to the list.");
		
			values.insert(50);
		
			System.out.println("Inserting the value 30 to the list.");
		
			values.insert(30);
		
			// Display the list.
		
			DisplayList(values);
		
			// Retrieve the value from the list.
		
			System.out.println("Value at the index 2 is: " + values.retrieve(2));
		
			System.out.println("Value at the index 10 is: " + values.retrieve(10)+"\n");
		
			// Search the value in the list.
		
			System.out.println("Searching the value 50: "+ values.search(50)+"\n");
		
			// Display.
		
			DisplayList(values);
		
		}
	
	}