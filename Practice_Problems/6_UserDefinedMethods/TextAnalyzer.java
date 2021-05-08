import java.util.Scanner;

public class TextAnalyzer {
   // Method counts the number of characters
   public static int getNumOfCharacters(final String usrStr) {
      int i;
      int count = 0;
      for (i = 0; i < usrStr.length(); ++i) {
         count++;
         }
      return count;
   }
   
   public static void outputWithoutWhitespace(String usrStr) {
      usrStr = usrStr.replaceAll(" ", "");
      System.out.println("String with no whitespace: " + usrStr);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Enter a sentence or phrase:");
      String inputString = scnr.nextLine();
      System.out.println("");
      System.out.println("You entered: " + inputString);
      System.out.println("");
      System.out.println("Number of characters: " + getNumOfCharacters(inputString));
      outputWithoutWhitespace(inputString);
      
   }
}
