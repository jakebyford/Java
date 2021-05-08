import java.util.Scanner;

public class IncomeTax {                         
   public static void main (String [] args) {    
      final int MAX_ELEMENTS = 10;
      Scanner scnr = new Scanner(System.in);
      int annualSalary;
      double taxRate;
      int taxToPay;
      int totalSalaries;
      int totalTaxes;
      int numSalaries;
      boolean keepLooking;
      int i;

      int []    salaryBase     = { 20000,     50000,     100000,     999999999 };
      double [] taxBase        = {   .10,       .20,        .30,           .40 };
      int []    annualSalaries = new int[MAX_ELEMENTS];
      int []    taxesToPay     = new int[MAX_ELEMENTS];
          
          
          
      numSalaries = 0;
      System.out.println("\nEnter annual salary (0 to exit): ");
      annualSalary = scnr.nextInt();



      while ((annualSalary > 0) && (numSalaries < MAX_ELEMENTS)) { 
         i = 0;
         taxRate = 0;
         keepLooking = true;

                  // Search for appropriate table row for given annualSalary
                  while ((i < salaryBase.length) && keepLooking) {
                     if (annualSalary <= salaryBase[i]) {
                        taxRate = taxBase[i];
                        keepLooking = false;
                     }
                     else {
                        ++i;
                     }
                  } // End inner while loop (search for appropriate table row)

         taxToPay = (int)(annualSalary * taxRate); // Truncate tax to an integer amount
         annualSalaries[numSalaries] = annualSalary;
         taxesToPay[numSalaries] = taxToPay;

         System.out.println("Annual salary: " + annualSalaries[numSalaries] +
                            "\tTax rate: " + taxRate +
                            "\tTax to pay: " + taxesToPay[numSalaries]);
         ++numSalaries;
         
         // Get the next annual salary
         if (numSalaries < MAX_ELEMENTS) {
            System.out.println("\nEnter annual salary  (0 to exit): ");
            annualSalary = scnr.nextInt();
         }
      } // End outer while loop (valid annualSalary entered)

      // Sum the annual salaries and taxes to pay and print the totals
      totalSalaries = 0;
      totalTaxes = 0;
      
      for (i = 0; i < numSalaries; ++i) {
         totalSalaries += annualSalaries[i];
         totalTaxes    += taxesToPay[i];
      }
      System.out.println("\nTotal salaries: " + totalSalaries +
                         "\tTotal taxes: " + totalTaxes);
   }
}