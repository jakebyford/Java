import java.util.Scanner;

public class PhoneNumberDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String phoneStr;   // User input: Phone number string
      int i;             // Current index in phone number string
      char currChar;     // Current char in phone number string
      
      System.out.println("Enter phone number: ");
      phoneStr = scnr.next();
     
      System.out.print("Numbers only: ");

      for (i = 0; i < phoneStr.length(); ++i) { // For each element
         currChar = phoneStr.charAt(i);
         if (((currChar >= '0') && (currChar <= '9')) || (currChar == '-')) {
            System.out.print(currChar); // Print character as is
         }
         else if ( ((currChar >= 'a') && (currChar <= 'c')) ||
                   ((currChar >= 'A') && (currChar <= 'C')) ) {
            System.out.print('2');
         }
         else if ( ((currChar >= 'd') && (currChar <= 'f')) ||
                   ((currChar >= 'D') && (currChar <= 'F')) ) {
            System.out.print('3');
         }
         else if ( ((currChar >= 'g') && (currChar <= 'i')) ||
                   ((currChar >= 'G') && (currChar <= 'I')) ) {
            System.out.print('4');
         }
         else if ( ((currChar >= 'j') && (currChar <= 'l')) ||
                   ((currChar >= 'J') && (currChar <= 'L')) ) {
            System.out.print('5');
         }
         else if ( ((currChar >= 'm') && (currChar <= 'o')) ||
                   ((currChar >= 'M') && (currChar <= 'O')) ) {
            System.out.print('6');
         }
         else if ( ((currChar >= 'p') && (currChar <= 's')) ||
                   ((currChar >= 'P') && (currChar <= 'S')) ) {
            System.out.print('7');
         }
         else if ( ((currChar >= 't') && (currChar <= 'v')) ||
                   ((currChar >= 'T') && (currChar <= 'V')) ) {
            System.out.print('8');
         }
         else if ( ((currChar >= 'w') && (currChar <= 'z')) ||
                   ((currChar >= 'W') && (currChar <= 'Z')) ) {
            System.out.print('9');
         }
         // FIXME: Add remaining else-if branches
         else {
            System.out.print('?');
         }      
      }
   }
}
