import java.util.Scanner;

public class CountInputLengthWithoutSpacesPeriodsExclamationPointsOrCommas {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      String newStr;
      int i;

      userText = "";
      userText = scnr.nextLine();
      newStr = "";

      for (i = 0; i < userText.length(); ++i) {
         if (userText.charAt(i)>=63 && userText.charAt(i)<=122) {
            newStr += userText.charAt(i);
         }
      } 
      System.out.println(newStr.length());
   }
}