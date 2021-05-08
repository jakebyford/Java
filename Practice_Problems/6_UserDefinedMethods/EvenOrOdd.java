import java.util.Scanner; 

public class EvenOrOdd {
   
   public static boolean isArrayEven(int[] arrayValues, int arraySize) {
      boolean isEven = false;
      int i;
      
      for (i = 0; i < arraySize; ++i) {
         if (arrayValues[i] % 2 == 0) {
            isEven = true;
            }
         else {
            isEven = false;
            break;
            }
         }
         return isEven;
      }
      
   public static boolean isArrayOdd(int[] arrayValues, int arraySize) {
      boolean isOdd = false;
      int i;
      
      for (i = 0; i < arraySize; ++i) {
         if (arrayValues[i] % 2 != 0) {
            isOdd = true;
            }
         else {
            isOdd = false;
            break;
            }
         }
         return isOdd;
      }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      int [] array = new int[numElements];
      int i;
      
      for (i = 0; i < numElements; ++i) {
         array[i] = scnr.nextInt();
         }
      
      
      if (isArrayEven(array, numElements)) {
         System.out.println("all even");
         }
      else if (isArrayOdd(array, numElements)) {
         System.out.println("all odd");
         }
      else {
         System.out.println("not even or odd");
         }
   }
}
