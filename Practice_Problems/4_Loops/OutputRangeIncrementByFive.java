// *********************************************************************************
// Write a program whose input is two integers, and whose output is the first integer 
// and subsequent increments of 5 as long as the value is less than or equal to the second integer.
//
// Ex: If the input is:
//
// -15 10
// the output is:
//
// -15 -10 -5 0 5 10
// Ex: If the second integer is less than the first as in:
//
// 20 5
// the output is:
//
// Second integer can't be less than the first.
//
// *********************************************************************************
import java.util.Scanner;

public class OutputRangeIncrementByFive {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Integer val1 = new Integer(scnr.nextInt());
      Integer val2 = new Integer(scnr.nextInt());
      Integer newVal = new Integer(val1);


      while (val1 <= val2) {
            System.out.print(val1);
            System.out.print(" ");
            val1 += 5;

            if (val1 > val2) {
               System.out.println("");
               break;
               }
         } 

      while (newVal > val2) {
         System.out.println("Second integer can't be less than the first.");
         break;
         }
   }
}
