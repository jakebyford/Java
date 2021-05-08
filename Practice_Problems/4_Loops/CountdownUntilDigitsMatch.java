import java.util.Scanner;

public class CountdownUntilDigitsMatch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Integer i = new Integer(scnr.nextInt());


      while (i <= i.valueOf(i)) {
         if (i < 11 || i > 100) {
            System.out.println("Input must be 11-100");
            break;
         }
         if (i == 11) {
            System.out.println(i + " ");
            break;
         }


         System.out.print(i + " ");
         --i;

         if (i % 11 == 0) {
            System.out.print(i + " ");
            System.out.println("");
            break;
         }


      } 
   } 
}