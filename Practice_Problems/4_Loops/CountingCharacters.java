
import java.util.Scanner;

public class CountingCharacters {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char userChar;
      String userString;
      int i;
      int numChars;

      userChar = scnr.next().charAt(0);
      userString = scnr.nextLine();
      numChars = 0;


      for(i = 0; i < userString.length(); ++i) {
         if (userChar == userString.charAt(i)) {
            ++numChars;
         }
      }

      if(numChars >= 2 || numChars <= 0) {
         System.out.println(numChars + " " + userChar + "'s");
         }
      else {
         System.out.println(numChars + " " + userChar);
         }
   }
}
