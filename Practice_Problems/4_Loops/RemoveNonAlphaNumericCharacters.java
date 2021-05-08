// **************************************************************************************************
// 
// In the following example, we are defining logic to remove special characters 
// from a string. We know that the ASCII value of capital letter alphabets starts 
// from 65 to 90 (A-Z) and the ASCII value of small letter alphabet starts from 97 to 122 (a-z). 
// Each character compare with their corresponding ASCII value. If both the specified condition 
// return true it return true else return false. The for loop executes till the length of the string. 
// When the string reaches its size, it terminates execution and we get the resultant string.
//
// **************************************************************************************************

import java.util.Scanner;

public class RemoveNonAlphaNumericCharacters {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userPass;
      String newStr;
      int i;

      userPass = "";
      userPass = scnr.nextLine();
      newStr = "";

      for (i = 0; i < userPass.length(); ++i) {
         if (userPass.charAt(i)>64 && userPass.charAt(i)<=122) {
            newStr += userPass.charAt(i);
         }
      } 
      System.out.println(newStr);
   }
}
