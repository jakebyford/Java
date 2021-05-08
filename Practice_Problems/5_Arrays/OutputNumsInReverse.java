import java.util.Scanner;

public class OutputNumsInReverse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      int tempVal;
      int i;

      System.out.println("How many integers do you want to list? (20 max)");
      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      System.out.println("List your integers seperated by a space: ");
      for (i = 0; i < numElements; ++i) {
         userList[i] = scnr.nextInt();
         }
         
      for (i = numElements - 1; i >= 0; --i) {
         System.out.print(userList[i] + ",");
         }
      System.out.println("");
   }
}
