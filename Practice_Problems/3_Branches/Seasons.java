import java.util.Scanner; 

public class Seasons {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      String inputMonth;
      int inputDay;
      
      inputMonth = scnr.next();
      inputDay = scnr.nextInt();
      
         
      if (inputMonth.equals("March") && inputDay >= 20) {
         System.out.println("Spring");
         }
      else if (inputMonth.equals("April")) {
         System.out.println("Spring");
         }
      else if (inputMonth.equals("May")) {
         System.out.println("Spring");
         }
      else if (inputMonth.equals("June") && inputDay <= 20 && inputDay > 0) {
         System.out.println("Spring");
         }
      else if (inputMonth.equals("June") && inputDay > 20) {
         System.out.println("Summer");
         }
      else if (inputMonth.equals("July")) {
         System.out.println("Summer");
         }
      else if (inputMonth.equals("August")) {
         System.out.println("Summer");
         }
      else if (inputMonth.equals("September") && inputDay <= 21) {
         System.out.println("Summer");
         }
      else if (inputMonth.equals("September") && inputDay > 21 && inputDay <= 30) {
         System.out.println("Autumn");
         }
      else if (inputMonth.equals("October")) {
         System.out.println("Autumn");
         }
      else if (inputMonth.equals("November")) {
         System.out.println("Autumn");
         }
      else if (inputMonth.equals("December")  && inputDay <= 20 && inputDay > 0) {
         System.out.println("Autumn");
         }
      else if (inputMonth.equals("December")  && inputDay > 20) {
         System.out.println("Winter");
         }
      else if (inputMonth.equals("January")) {
         System.out.println("Winter");
         }
      else if (inputMonth.equals("February") && inputDay <= 28 && inputDay > 0) {
         System.out.println("Winter");
         }
      else if (inputMonth.equals("March") && inputDay < 20 && inputDay > 0) {
         System.out.println("Winter");
         }
      else if (inputDay <= 0 && inputDay >= 32) { 
         System.out.print("Invalid");
         }
      else {
         System.out.println("Invalid");
         }
   }
}
