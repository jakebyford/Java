import java.util.Scanner; 

public class ConvertToBinaryMethod {
   
   public static String integerToReverseBinary(int integerValue) {
      String binaryVal = "";
      while (integerValue > 0) {
         binaryVal = binaryVal.concat(String.valueOf(integerValue % 2));
         integerValue = integerValue / 2;
         }
         return binaryVal;
   }
   public static String reverseString(String inputString) {
      String reverseBinaryVal = "";
      int i;
      for (i = inputString.length() - 1; i >= 0; --i) { 
         reverseBinaryVal = reverseBinaryVal.concat(Character.toString(inputString.charAt(i)));
      }
      return reverseBinaryVal;
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      
      System.out.println("Input number: ");
      int inputInt = scnr.nextInt();
      
      System.out.println(reverseString(integerToReverseBinary(inputInt)));
   }
}
