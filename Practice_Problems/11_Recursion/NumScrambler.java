import java.util.Scanner;
import java.util.ArrayList;

public class NumScrambler {
   public static void scrambleNums(ArrayList<Integer> remainNums, 
                                   ArrayList<Integer> scramNums) {
      ArrayList<Integer> tmpRemainNums;
      int tmpRemovedNum;
      int i;
      int cnt = 0;
      
      if (remainNums.size() == 0) {
         System.out.print(scramNums.get(0));
         System.out.print(scramNums.get(1));
         System.out.println(scramNums.get(2));
      }
      else {
         for (i = 0; i < remainNums.size(); ++i) {
            tmpRemainNums = new ArrayList<Integer>(remainNums); // Make a copy.
            	System.out.println(tmpRemainNums + " " + scramNums);
            	System.out.println("Count: " + cnt);
            tmpRemovedNum = tmpRemainNums.remove(i);
            	System.out.println(" " + tmpRemainNums + " " + scramNums);
            scramNums.add(tmpRemovedNum);
            	System.out.println("  " + tmpRemainNums + " " + scramNums);
            	System.out.println("  " + tmpRemainNums.size() + " " + scramNums.size());
            scrambleNums(tmpRemainNums, scramNums);
            	System.out.println("       " + tmpRemainNums + " " + scramNums);
            scramNums.remove(scramNums.size() - 1);
            	System.out.println("           " + tmpRemainNums + " " + scramNums);
            	System.out.println("           " + tmpRemainNums.size() + " " + scramNums.size());
            	++cnt;
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> numsToScramble = new ArrayList<Integer>();
      ArrayList<Integer> resultNums = new ArrayList<Integer>();

      numsToScramble.add(4);
      numsToScramble.add(0);
      numsToScramble.add(6);

      scrambleNums(numsToScramble, resultNums);
   }
}
