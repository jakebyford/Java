import java.util.Scanner;

public class Acronyms {
   
   public static String createAcronym(String userPhrase){
      String chr = "";
      int i;
      for (i = 0; i < userPhrase.length(); ++i) {
         if (userPhrase.charAt(i) >= 65 && userPhrase.charAt(i) <= 90) {
            chr = chr.concat(Character.toString(userPhrase.charAt(i)));
            }
         }
      return chr;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      
      System.out.println("Enter a phrase to derive an acroynm.");
      System.out.println("For instance, New York City is NYC. Try it out yourself.");
      System.out.println("");
      System.out.println("Enter phrase: ");
      String inputPhrase = scnr.nextLine();
      
      System.out.println(createAcronym(inputPhrase));
   }
}
