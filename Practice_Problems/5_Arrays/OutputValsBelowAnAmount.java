import java.util.Scanner; 

public class OutputValsBelowAnAmount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input
      int numElements;
      int i;
      int threshold;
      
      numElements = scnr.nextInt();
      for(i = 0; i < numElements; ++i) {
         userValues[i] = scnr.nextInt();
         }
      threshold = scnr.nextInt();
      for (i = 0; i < numElements; ++i) {
         if (userValues[i] < threshold) {
            System.out.print(userValues[i] + ",");
            }
         }
      System.out.println("");
   }
}
