import java.util.Scanner;
public class NestedForLoop {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      /*
       * This only works for n rows by 3 columns unless you change 'C' to a higher char like 'D', 'E', etc....
       */
      for (currentRow = 1; currentRow <= numRows; ++currentRow) {
            currentColumnLetter = 'A';
         for (currentColumn = 1; currentColumn <= numColumns; ++currentColumn) {
            System.out.print(currentRow);
            
               if (currentColumnLetter <= 'C') {
                  System.out.print(currentColumnLetter + " ");
                  ++currentColumnLetter;
                  }
                  
               }            
            }
      System.out.println("");
   }
}