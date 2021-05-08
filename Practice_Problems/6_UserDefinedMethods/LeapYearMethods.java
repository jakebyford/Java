import java.util.Scanner; 

public class LeapYearMethods {

   public static boolean isLeapYear(int inputYear) {
      boolean leapYear = false;
      
      if (inputYear % 100 == 0 && inputYear % 400 == 0 && inputYear % 4 == 0) {
            leapYear = true;
            }
      else if (inputYear % 100 == 0 && inputYear % 400 != 0 && inputYear % 4 == 0) {
            leapYear = false;
            }
      else if (inputYear % 4 == 0) {
            leapYear = true;
         }
      
      return leapYear;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userYear = scnr.nextInt();
      
      if (isLeapYear(userYear)) {
         System.out.println(userYear + " is a leap year."); 
      }
      else {
         System.out.println(userYear + " is not a leap year.");
      }
   }
}
