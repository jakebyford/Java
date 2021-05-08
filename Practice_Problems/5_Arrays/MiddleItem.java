import java.util.Scanner; 

public class MiddleItem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user      
      int i;
      int userVal;
      int numElements;
         
      
      numElements = 0;
      userVal = scnr.nextInt();
      i = 0;
      while ( (userVal >= 0) ) {
         if (i == userValues.length) {
            System.out.println("Too many numbers");
            break;
            }
            
         userValues[i] = userVal;
         userVal = scnr.nextInt();
            
            if (userVal < 0){
                  if (numElements > userValues.length) {
                     System.out.println("Too many numbers");
                     }
                  else {
                     System.out.println("Middle item: " + userValues[i/2]);
                     }
               }
               
            else {
               ++i;
               ++numElements;
               }
               
            }
         }
   }