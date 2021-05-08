import java.util.Scanner;

public class ReplacementWords {

   public static int findWordInWordList(String[] wordList, String wordToFind, int numInList) {
      int i;
      for (i = 0; i < numInList; ++i) {
         if (wordToFind.equals(wordList[i])) {
            return i;
            }
         }
      return -1;
      }

   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int numPairs = scnr.nextInt();
      String [] origWord = new String[numPairs];
      String [] newWord = new String[numPairs];
      int i;
      
      for (i = 0; i < numPairs; ++i) {
         origWord[i] = scnr.next();
         newWord[i] = scnr.next();
         }
         
      int numWords = scnr.nextInt();
      String [] words = new String[numWords];
      for (i = 0; i < numWords; ++i) {
         words[i] = scnr.next();
         }
         
      // use string.replace()
      for (i = 0; i < numWords; ++i) {
         int index = findWordInWordList(origWord, words[i], numPairs);
         if (index != -1) {
            words[i] = newWord[index]; 	// Ex) words[9] can equal newWord[0, 1, or 2];
            }
      }
      
      for (i = 0; i < numWords; ++i) {
         System.out.print(words[i] + " ");
         }
      System.out.println("");
   }
}
