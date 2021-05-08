import java.util.Scanner; 

public class MaxValueAndAverage {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int maxValue;
      int currValue;
      int sum;
      int numVals;
      int i;

      i = 0;
      sum = 0;
      maxValue = -1;
      numVals = scnr.nextInt();

      while (numVals >= 0) {
         if (numVals > maxValue) {
            maxValue = numVals;
            }
         sum += numVals;
         numVals = scnr.nextInt();
         ++i;
         }
      System.out.println(maxValue + " " + (sum / i));
   }
}
