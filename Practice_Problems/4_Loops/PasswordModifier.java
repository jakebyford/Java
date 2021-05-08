// *********************************************************************************
// Many user-created passwords are simple and easy to guess. 
// Write a program that takes a simple password and makes it stronger 
// by replacing characters using the key below, and by appending "!" 
// to the end of the input string.

// i becomes 1
// a becomes @
// m becomes M
// B becomes 8
// s becomes $
//
// **********************************************************************************
import java.util.Scanner;

public class PasswordModifier {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userPass;
      int i;
      userPass = scnr.next();

      for (i = 0; i < userPass.length(); ++i) {
            if (userPass.charAt(i) == 'a') {
               userPass = userPass.replace('a', '@');
               continue;
               }
            else if (userPass.charAt(i) == 'i') {
               userPass = userPass.replace('i', '1');
               continue;
               }
            else if (userPass.charAt(i) == 'm') {
               userPass = userPass.replace('m', 'M');
               continue;
               }
            else if (userPass.charAt(i) == 'B') {
               userPass = userPass.replace('B', '8');
               continue;
               }
            else if (userPass.charAt(i) == 's') {
               userPass = userPass.replace('s', '$');
               continue;
               }
            }  System.out.println(userPass + "!");
   }
}
