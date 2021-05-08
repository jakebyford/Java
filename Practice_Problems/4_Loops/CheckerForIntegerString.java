// *************************************************************************
// Forms often allow a user to enter an integer. 
// Write a program that takes in a string representing an integer as input, 
// and outputs Yes if EVERY character is a digit 0-9.
// *************************************************************************

import java.util.Scanner; 

public class CheckerForIntegerString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
      int i;
      boolean isDigit = false;

      userString = scnr.next();

         for (i = 0; i < userString.length(); ++i) {
            if (Character.isDigit(userString.charAt(i))) {
               isDigit = true;
               continue;
               }
            else {
               isDigit = false;
               break;
               }
         }

         if (isDigit == true) {
               System.out.println("Yes");
               }
         else {
               System.out.println("No");
            }
   }
}