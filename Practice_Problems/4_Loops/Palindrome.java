import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      String str;
      String newStr;
      int left;
      int right;
      
      str = scnr.nextLine();
      newStr = str.replace(" ", "");
      
      left = 0;
      right = newStr.length() - 1;
      
      while (newStr.charAt(left) == newStr.charAt(right) && left < right) {
         ++left;
         --right;
         }
            if (left < right) {
               System.out.println("not a palindrome: " + str);
            }
            else {
               System.out.println("palindrome: " + str);
               }
   }
}