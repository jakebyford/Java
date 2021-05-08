import java.util.Scanner;
import java.util.ArrayList;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Read dates from input, parse the dates to find the one
      //       in the correct format, and output in m/d/yyyy format
      ArrayList<String> dates = new ArrayList<String>();
      String lineString;                     // Holds line of text
      String month;
      String day;
      String year;
      boolean inputDone;                     // Flag to indicate next iteration
      
      inputDone = false;
      
      while (!inputDone) {
         
         // Entire line into lineString
         lineString = scnr.nextLine();
         
         if (lineString.equals("-1")) {
            inputDone = true;
            }
         
         else {
            
            dates.add(lineString);
               
            }
         }
         String x = "";
         ArrayList<String> array = new ArrayList<String>();
         for(int i = 0; i < dates.size(); ++i) {
            
            if (!(dates.get(i).indexOf(",") == -1 ||  dates.get(i).indexOf(" ") == -1)) {
               x = dates.remove(i);
               array.add(x);
               --i;
            }
         }
         
         // System.out.println(array);
         
         for (int i = 0; i < array.size(); ++i) {
            
               month = array.get(i).substring(0, array.get(i).indexOf(" "));
               day = array.get(i).substring(array.get(i).indexOf(" ") + 1, array.get(i).indexOf(","));
               year = array.get(i).substring(array.get(i).indexOf(",") + 2, array.get(i).length());
               
               System.out.println(getMonthAsInt(month) + "/" + day + "/" + year);
            }
   }
}
