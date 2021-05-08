import java.util.Scanner;

public class ContainsTheChar {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int numElements = scnr.nextInt();
      
      String [] words = new String[20];
      String word;
      char letter;
      int i;
      int j;
      
      for (i = 0; i < numElements; ++i) {
         words[i] = scnr.next();
         }
      
      letter = scnr.next().charAt(0);
      
      for (i = 0; i < numElements; ++i) {
         word = words[i];
         for (j = 0; j < word.length(); ++j) {
            if (word.charAt(j) == letter) {
               System.out.print(word + ",");
               break;
            }
         }
      }
         
         
   }
}
