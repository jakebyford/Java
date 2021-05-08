import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String lineString;                     // Holds line of text
      String firstWord;
      String lastWord;
      boolean inputDone;                     // Flag to indicate next iteration
      
      inputDone = false;
      
      while (!inputDone) {
         
         // Entire line into lineString
         System.out.println("Enter input string:");
         lineString = scnr.nextLine();
         
         if (lineString.equals("q")) {
            inputDone = true;
            }
         
         else if (lineString.indexOf(",") == -1) {
            System.out.println("Error: No comma in string.");
            System.out.println("");
            }
         
         else {
            
            lineString = lineString.replace(" ", "");
            lineString = lineString.replace(",", " ");
            
            Scanner inSS = new Scanner(lineString);
      
            // Parse word values from string
            firstWord = inSS.next();
            lastWord = inSS.next();
            
            
            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + lastWord);
            System.out.println("");  
            }
         }
   }
}
