import java.util.Scanner;

public class SortArrayMethod {

   public static void sortArray(int[] myArr, int arrSize) {
      for (int i = 1; i < arrSize; ++i) {
         int val = myArr[i];
         int j = i - 1;
         while (j >= 0 && val < myArr[j]) {
            myArr[j + 1] = myArr[j];
            j = j - 1;
            }
            myArr[j + 1] = val;
         }
      }

   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int numElements = scnr.nextInt();
      int [] array = new int[numElements];
      int i;
      
      for (i = 0; i < numElements; ++i) {
         array[i] = scnr.nextInt();
         }
         
      sortArray(array, numElements);
      
      for (i = 0; i < numElements; ++i) {
         System.out.print(array[i] + " ");
      }
      System.out.println("");
   }
}
