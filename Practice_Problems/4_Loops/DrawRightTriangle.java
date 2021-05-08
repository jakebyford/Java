import java.util.Scanner; 

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char triangleChar;
      int triangleHeight;
      int i;
      int j;
      
      System.out.println("Enter a character:");
      triangleChar = scnr.next().charAt(0);   
      
      System.out.println("Enter triangle height:");
      triangleHeight = scnr.nextInt();

      
      for (i = 0; i < triangleHeight + 1; ++i) {
         for (j = 0; j < triangleHeight; ++j) {
            if (i == j) {
               break;
               }
            else {
               System.out.print(triangleChar + " ");
               }
            }
            System.out.println("");
         }
   }
}