import java.util.Scanner;

public class AdjustListByNormalizingMethod {
   
   public static int getMinimumInt(int[] listInts, int listSize) {
      int min = listInts[0];
      int i;
      for (i = 0; i < listSize; ++i) {
         if (min > listInts[i]) {
            min = listInts[i];
            }
         }
      return min;
      }

   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int numElements = scnr.nextInt();
      int [] array = new int[numElements];
      int j;
      
      for (j = 0; j < numElements; ++j) {
         array[j] = scnr.nextInt();
         }
         
      int min = getMinimumInt(array, numElements);
      for (j = 0; j < numElements; ++j) {
         System.out.print((array[j] - min) + " ");
            }
            System.out.println("");
         }
   }
