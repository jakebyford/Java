import java.util.Scanner; 

public class ExactChangeMethod {
   
   public static void exactChange(int userTotal, int[] coinVals) {
      
      coinVals[0] = userTotal / 100;

      userTotal = userTotal % 100;
      
      coinVals[1] = userTotal / 25;
      
      userTotal = userTotal % 25;
      
      coinVals[2] = userTotal / 10;
      
      userTotal = userTotal % 10;
      
      coinVals[3] = userTotal / 5;
      
      userTotal = userTotal % 5;
      
      coinVals[4] = userTotal;

   }
   
   public static void main(String[] args) {
      int userTotal;
      Scanner sc=new Scanner(System.in);

       System.out.println("Enter your amount: ");

      userTotal=sc.nextInt();

      if (userTotal == 0) {
            System.out.println("no change");
         }

      else {

         int coinVals[]=new int[5];
         exactChange(userTotal, coinVals);
   
            if (coinVals[0] == 1) {
               System.out.println(coinVals[0]+" dollar");
               }
            else if (coinVals[0] != 0) {
               System.out.println(coinVals[0] + " dollars");
               }
   
   
            if (coinVals[1] == 1) {
               System.out.println(coinVals[1] + " quarter");
               }   
            else if(coinVals[1] != 0) {
               System.out.println(coinVals[1] + " quarters");
               }
            
            
            if (coinVals[2] == 1) {
               System.out.println(coinVals[2]+ " dime");
               }
            else if(coinVals[2] != 0) {
               System.out.println(coinVals[2] + " dimes");
               }
            
            
            if (coinVals[3] == 1) {
               System.out.println(coinVals[3] + " nickel");
               }
            else if(coinVals[3] != 0) {
               System.out.println(coinVals[3] + " nickels");
               }
            
            
            if (coinVals[4] == 1) {
               System.out.println(coinVals[4] + " penny");
               }
            else if(coinVals[4] != 0) {
               System.out.println(coinVals[4] + " pennies");
               }
            
      
      }
      
   }
      
}