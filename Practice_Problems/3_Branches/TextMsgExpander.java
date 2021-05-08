import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

            String userText;
      

      System.out.println("Enter text:");
      userText = scnr.nextLine();
      System.out.println("You entered: " + userText);
      System.out.println("");
      
      if (userText.indexOf("BFF") >= 0) {
            userText = userText.replace("BFF", "best friend forever");
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
         }
      if (userText.indexOf("IDK") >= 0) {
            userText = userText.replace("IDK", "I don't know");
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
         }
         
      if (userText.indexOf("JK") >= 0) {
            userText = userText.replace("JK", "just kidding");
            System.out.println("Replaced \"JK\" with \"just kidding\".");
         }
      if (userText.indexOf("TMI") >= 0) {
            userText = userText.replace("TMI", "too much information");
            System.out.println("Replaced \"TMI\" with \"too much information\".");
         }
      if (userText.indexOf("TTYL") >= 0) {
            userText = userText.replace("TTYL", "talk to you later");
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
         }
      
      System.out.println("");
      System.out.println("Expanded: " + userText);
   }
}
