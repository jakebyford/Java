import java.util.Scanner;

public class TwoSmallestNums {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      int [] array = new int [numElements];
      int i;
      int min1;
      int min2;
      
      for (i = 0; i < numElements; ++i) {
         array[i] = scnr.nextInt();
         }
         
      for (i = 1; i < array.length; ++i) {
         int val = array[i];
         int j = i - 1;
         while (j >= 0 && val < array[j]) {
            array[j + 1] = array[j];
            j = j -1;
            }
            array[j + 1] = val;
         }
      min1 = 0;
      min2 = 0;
      for (i = 0; i < 1; ++i) {
         min1 = array[0];
         min2 = array[1];
      }
      
      System.out.println(min1 + " and " + min2);
   }
}