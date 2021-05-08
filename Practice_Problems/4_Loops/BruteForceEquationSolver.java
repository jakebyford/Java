import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int a;
      int b;
      int c;
      int d;
      int e;
      int f;
      
      int x;
      int y;
      boolean found;
      

      a = scnr.nextInt();
      b = scnr.nextInt();
      c = scnr.nextInt();
      scnr.nextLine();
      d = scnr.nextInt();
      e = scnr.nextInt();
      f = scnr.nextInt();

      x = 0;
      y = 0;
      found = false;
      
      for (x = -10; x < 11; ++x) {
         for (y = -10; y < 11; ++y) {
            if ((a * x) + (b * y) == c && (d * x) + (e * y) == f) {
                found = true;
                break;
               }
            else {
               continue;
               }
         }   
      
     
         if (found) {
            System.out.println("x = " + x + ", y = " + y);
            break;
         }
      } 
      if (!found) {
             System.out.println("There is no solution");
         }
   }
}
