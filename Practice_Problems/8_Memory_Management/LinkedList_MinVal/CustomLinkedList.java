
public class CustomLinkedList {
   public static void main(String[] args) {
      IntNode headObj; // Create IntNode reference variables
      IntNode currObj;
      IntNode lastObj;
      int i;           // Loop index
      
      headObj = new IntNode(150000); // Front of nodes list
      lastObj = headObj;
      
      for (i = 0; i < 20; ++i) { // Append 20 rand nums
         int rand = (int)(Math.random() * 100000); // random int (0-99999)
         currObj = new IntNode(rand);
         
         lastObj.insertAfter(currObj); // Append curr
         lastObj = currObj;
      }
      
      // Meat of finding the min value
      
      int min = 0;
      currObj = headObj; // Print the list
      while (currObj != null) {
         currObj.printNodeData();
         currObj = currObj.getNext();
         min = headObj.smallestValue(headObj);  // smallest_value method in IntNode.java
      }
      
      System.out.println();
      System.out.println(min);
      
   }
}
