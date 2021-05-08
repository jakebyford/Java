import java.util.Scanner; 

public class AdjustListByNormalizing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      float [ ] userValues = new float[20];
      int numElements;
      int i;
      float max;
      
      numElements = scnr.nextInt();
      for (i = 0; i < numElements; ++i) {
         userValues[i] = scnr.nextFloat();
      }
         
      max = userValues[0];
      for (i = 0; i < numElements; ++i) {
         if (userValues[i] > max) {
            max = userValues[i];
         }
      }
      
      for (i = 0; i < numElements; ++i) {
         System.out.printf("%.2f", userValues[i]/max);
         System.out.print(" ");
         }
      System.out.println("");
      }
   }
