import java.util.Scanner;

public class IncomeTax {                         
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      int annualSalary;
      double taxRate;
      int taxToPay;
      int startingAnnualSalary;
      int endingAnnualSalary;
      int salaryIncrement;

      annualSalary = 0;

      System.out.println("Enter first annual salary for the table: ");
      startingAnnualSalary = scnr.nextInt();   // Start the starting salary to 40000

      System.out.println("Enter last annual salary for the table: ");
      endingAnnualSalary = scnr.nextInt();     // Start the ending salary to 60000

      System.out.println("Enter the increment for the table: ");
      salaryIncrement = scnr.nextInt(); 

      // Use a for loop to calculate the tax for each entry in the table. 
      // The initialization clause is annualSalary = startingAnnualSalary
      for (annualSalary = startingAnnualSalary; annualSalary <= endingAnnualSalary; annualSalary += salaryIncrement) {

         // Determine the tax rate from the annual salary
         if (annualSalary <= 0) {
            taxRate = 0.0;
         }
         else if (annualSalary <= 20000) {
            taxRate = 0.10;   // 0.10 is 10% written as a decimal
         }
         else if (annualSalary <= 50000) {
            taxRate = 0.20;
         }
         else if (annualSalary <= 100000) {
            taxRate = 0.30;
         }
         else {
            taxRate = 0.40;
         }

         taxToPay = (int)(annualSalary * taxRate);   // Truncate tax to an integer amount
         System.out.println("Annual salary: " + annualSalary + 
                            "\tTax rate: " + taxRate +
                            "\tTax to pay: " + taxToPay);

      }// Be sure to include the closing brace for the for loop
   }
}
