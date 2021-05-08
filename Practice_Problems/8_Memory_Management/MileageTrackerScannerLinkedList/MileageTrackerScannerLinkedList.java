/**
 * Run with following to see how it works
 *  3			// numItems in list (for loop)
	2.2			
	7/2/18
	3.2
	7/7/18
	4.5
	7/16/18
 */


import java.util.Scanner;

public class MileageTrackerScannerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;

      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode();
      lastNode = headNode;

      // TODO: Scan the number of nodes
         int numNodes = scnr.nextInt();
      // TODO: For the scanned number of nodes, scan
      //       in data and insert into the linked list
      currNode = headNode;
      for (i = 0; i < numNodes; ++i) {
         miles = scnr.nextDouble();
         date = scnr.next();
         currNode = new MileageTrackerNode(miles, date);
         
         lastNode.insertAfter(currNode);
         lastNode = currNode;
      }
      // TODO: Call the printNodeData() method 
      //       to print the entire linked list
      currNode = headNode;
      currNode = currNode.getNext();
      while (currNode != null) {
         currNode.printNodeData();
         currNode = currNode.getNext();
      }

   }
}
