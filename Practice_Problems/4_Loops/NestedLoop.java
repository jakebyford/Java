import java.util.Scanner;
public class NestedLoop {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      userNum = scnr.nextInt();

      i = 0;
      while (i <= userNum) {
         j = 0;
         while (j != i) {
            System.out.print(" ");
            ++j;   
         }
         System.out.println(i);
         ++i;
      }
   }
}