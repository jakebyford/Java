import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method
   public static void printNumPattern(int val1, int val2) {   
     
      if (val1 == 0) {
         System.out.print("0 ");
      }
      
      else if (val1 > 0) {
         
         System.out.print(val1 + " ");   
         printNumPattern(val1 - val2, val2);
         System.out.print(val1 + " ");
         }
      
      else {
         System.out.print(val1 + " ");
         }
     }
     
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2); 
   } 
}

