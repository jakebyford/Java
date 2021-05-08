import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      int i;

         userText = scnr.nextLine();
     
         while (!(userText.equals("d") || userText.equals("Done") || userText.equals("done"))) {
            for (i = userText.length() - 1; i >= 0; --i) { 
               System.out.print(userText.charAt(i));
            }
            System.out.println("");
            userText = scnr.nextLine();
            
         }
   }
}