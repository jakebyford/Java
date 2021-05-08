import java.util.Scanner;

public class IncomeTaxDeduction {
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      final String SALARY_PROMPT = "\nEnter annual salary (0 to exit): ";
      int annualSalary;
      int adjustedSalary;
      int deduction;
      int totalDeductions;
      double taxRate;
      int taxToPay;
      int fedTaxWithheld;

      System.out.println(SALARY_PROMPT);
      annualSalary = scnr.nextInt();

      while (annualSalary > 0) {
         // FIXME: Add a while loop to gather deductions. Use the variables
         // deduction and totalDeduction for deduction handling.
         // End the inner while loop when a deduction <= 0 is entered.
         totalDeductions = 0;
         System.out.println("Enter a deduction: ");
         deduction = scnr.nextInt();

         while(deduction > 0){
            totalDeductions += deduction;
            System.out.println("Enter an additional deduction: ");
            deduction = scnr.nextInt();
            }

         adjustedSalary = annualSalary - totalDeductions;
         if (adjustedSalary <= 0) {
            taxRate = 0.0;
         }
         // Determine the tax rate from the annual salary
         else if (adjustedSalary <= 9875) {
            taxRate = 0.10;        // 0.10 is 10% written as a decimal
         }
         else if (adjustedSalary <= 40125) {
            taxRate = 0.12;
         }
         else if (adjustedSalary <= 85525) {
            taxRate = 0.22;
         }
         else if (adjustedSalary <= 163300) {
             taxRate = 0.24;
          }
         else if (adjustedSalary <= 207350) {
             taxRate = 0.32;
          }
         else if (adjustedSalary <= 518400) {
             taxRate = 0.35;
          }
         else {
            taxRate = 0.37;
         }

         taxToPay = (int)(adjustedSalary * taxRate);   // Truncate tax to an integer amount
         System.out.println("Enter Federal Tax Withheld: ");
         fedTaxWithheld = scnr.nextInt();
         taxToPay = taxToPay - fedTaxWithheld;
         System.out.println("Annual salary: " + annualSalary); 
         System.out.println("Deductions: " + totalDeductions);
         System.out.println("Adjusted Salary: " + adjustedSalary);
         System.out.println("Tax rate: " + taxRate);
         System.out.println("Federal Tax Withheld: " + fedTaxWithheld);

         if (taxToPay >= 0) {
        	 System.out.println("Tax to pay: $" + taxToPay);
         }
         else {
        	 System.out.println("Tax return: $" + taxToPay * -1);
         }
         // Get the next annual salary
         System.out.println(SALARY_PROMPT);
         annualSalary = scnr.nextInt();
      }
   } 
}
