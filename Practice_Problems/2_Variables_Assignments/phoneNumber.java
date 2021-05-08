import java.util.Scanner;

public class phoneNumber {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      // Add more variables as needed

      phoneNumber = scnr.nextLong();
      
      /*  Ex) 5725551111
          
          The rightmost 2 digits of 572 is gotten by 572 % 100, which is 72.
		  Use / to shift right by the desired amount. 
		  Shifting 572 right by 2 digits is done by 572 / 100, which yields 5. 
		  (Recall integer division discards the fraction).
	  */
      
      System.out.print("(" + (phoneNumber / 10000000) + ") ");
      System.out.print((phoneNumber / 10000) % 1000 + "-");
      System.out.println(phoneNumber % 10000);
      /* Type your code here. */
   }
}
