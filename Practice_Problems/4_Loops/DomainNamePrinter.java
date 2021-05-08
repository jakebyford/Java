import java.util.Scanner;

public class DomainNamePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char letter1;
      char letter2;
      int num1;
      
      System.out.println("Two-letter domain names:");

      letter1 = 'a';
      while (letter1 <= 'z') {
         letter2 = 'a';
         num1 = 0;
         while (letter2 <= 'z') {
               while(num1 <= 9) {
                  System.out.println("" + letter1 +
                                     "" +    num1 + ".com");
                     ++num1;                   
                  }
            System.out.println("" + letter1 + 
                   "" + letter2 + ".com");
            ++letter2;
         }
         ++letter1;
      }
   }
}
