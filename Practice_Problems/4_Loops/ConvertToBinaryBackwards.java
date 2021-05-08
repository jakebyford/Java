import java.util.Scanner; 

public class ConvertToBinaryBackwards {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int x;

      x = scnr.nextInt();

      while (x > 0) {
         System.out.print(x % 2);
         x = x/2;
         }
         System.out.println("");
      }
}