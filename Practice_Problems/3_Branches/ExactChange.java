import java.util.Scanner; 

public class ExactChange {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int totalChange;
      int dollars;
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      
      totalChange = scnr.nextInt();
      dollars = 0;
      quarters = 0;
      dimes = 0;
      nickels = 0;
      pennies = 0;
 
         if (totalChange == 0) {
            System.out.println("No change");
            }

         dollars += (totalChange / 100);
         totalChange -= (dollars * 100);
            if (dollars == 1) {
               System.out.println(dollars + " Dollar");
               }
            else if(dollars != 0) {
               System.out.println(dollars + " Dollars");
               }
         quarters += totalChange / 25;
         totalChange -= (quarters * 25);
            if (quarters == 1) {
               System.out.println(quarters + " Quarter");
               }
            else if(quarters != 0) {
               System.out.println(quarters + " Quarters");
               }
         dimes += totalChange / 10;
         totalChange -= (dimes * 10);
            if (dimes == 1) {
               System.out.println(dimes + " Dime");
               }
            else if(dimes != 0) {
               System.out.println(dimes + " Dimes");
               }
         nickels += totalChange / 5;
         totalChange -= (nickels * 5);
            if (nickels == 1) {
               System.out.println(nickels + " Nickel");
               }
            else if(nickels != 0) {
               System.out.println(nickels + " Nickels");
               }
         pennies += totalChange / 1;
         totalChange -= (pennies * 1);
            if (pennies == 1) {
               System.out.println(pennies + " Penny");
               }
            else if(pennies != 0) {
               System.out.println(pennies + " Pennies");
               }
   }
}
