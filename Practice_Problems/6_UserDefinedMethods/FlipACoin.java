import java.util.Scanner;
import java.util.Random;

public class FlipACoin {
   
   public static String headsOrTails(Random rand) {
      
      if (rand.nextInt() > 0) {
         return "heads";
         }
      else {
         return "tails";
         }
      }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
	   int n;
	   
	   //prompt user to input number
	   System.out.print("Input number: ");
	   n = scnr.nextInt();

	   for(int i = 1; i < n + 1; ++i) {
		   System.out.println(i +") " + headsOrTails(rand));
	   }
	   
   }
}