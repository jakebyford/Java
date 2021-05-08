import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCharsInteractive {
   /* Method prints characters in a file using read(). 
      Throws IOException if read() operation fails. */
   public static void readFileChars(FileReader fileReader) throws IOException {
      int charRead;     // Data read from file

      charRead = 0;

      // Use file input stream
      System.out.print("Reading character values: ");
      while (charRead != -1) {   // -1 means end of file has been reached
         charRead = fileReader.read(); // May throw IOException
         System.out.print(charRead + " ");
      }
      System.out.println();
   }

   /* Method closes a FileReader. 
      Prints exception message if closing fails. */
   public static void closeFileReader(FileReader fileReader) {
      try {
         if (fileReader != null) { // Ensure fileReader references a valid object
            System.out.println("Closing file.");
            fileReader.close(); // close() may throw IOException if fails
         }
      } catch (IOException closeExcpt) {
         System.out.println("Error closing file: " + closeExcpt.getMessage());
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FileReader fileReader = null; // File stream for reading chars
      String fileName;                  // User defined file name
      boolean validFile;                // Ensures file opened

      validFile = true;

      do {
         // Get file name from user
         System.out.print("Enter a valid file name (or 'q' to quit): ");
         fileName = scnr.next();

         if (fileName.equals("q")) {
            break; // Exit do-while loop
         }

         try {
            // Prompt user for input
            System.out.println("Opening file " + fileName + ".");
            fileReader = new FileReader(fileName); // May throw FileNotFoundException

            validFile = true; // If reached this statement, file opened successfully.

            // Read chars from file
            readFileChars(fileReader); // May throw IOException
         } catch (FileNotFoundException excpt) {
            System.out.println("Caught FileNotFoundException: " + excpt.getMessage());
            validFile = false;
         } catch (IOException excpt) {
            System.out.println("Caught IOException: " + excpt.getMessage());
         } finally {
            closeFileReader(fileReader); // Ensure file is closed!
         }
      } while (!validFile);
   }
}
